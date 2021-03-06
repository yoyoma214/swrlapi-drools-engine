package org.swrlapi.drools.converters.oo;

import checkers.nullness.quals.NonNull;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.swrlapi.bridge.SWRLRuleEngineBridge;
import org.swrlapi.bridge.converters.TargetRuleEngineConverterBase;
import org.swrlapi.bridge.converters.TargetRuleEngineOWLIndividualConverter;
import org.swrlapi.drools.owl.individuals.I;

/**
 * Converts an OWLAPI OWL individual to a Drools individual represented by the class
 * {@link I}.
 *
 * @see org.semanticweb.owlapi.model.OWLIndividual
 * @see org.semanticweb.owlapi.model.OWLAnonymousIndividual
 * @see org.semanticweb.owlapi.model.OWLNamedIndividual
 * @see I
 */
public class DroolsOWLIndividual2IConverter extends TargetRuleEngineConverterBase
    implements TargetRuleEngineOWLIndividualConverter<I>
{
  public DroolsOWLIndividual2IConverter(@NonNull SWRLRuleEngineBridge bridge)
  {
    super(bridge);
  }

  @NonNull @Override public I convert(@NonNull OWLIndividual individual)
  {
    if (individual.isNamed()) {
      IRI individualIRI = individual.asOWLNamedIndividual().getIRI();
      String individualPrefixedName = getIRIResolver().iri2PrefixedName(individualIRI);
      return new I(individualPrefixedName);
    } else
      return new I(individual.asOWLAnonymousIndividual().getID().getID());
  }
}
