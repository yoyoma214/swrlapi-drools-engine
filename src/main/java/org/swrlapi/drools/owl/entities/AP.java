package org.swrlapi.drools.owl.entities;

import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.swrlapi.builtins.arguments.SWRLBuiltInArgument;
import org.swrlapi.drools.extractors.DroolsAA2SWRLAtomArgumentExtractor;
import org.swrlapi.drools.extractors.DroolsOWLEntityExtractor;
import org.swrlapi.drools.swrl.BA;
import org.swrlapi.exceptions.TargetRuleEngineException;

/**
 * This class represents an OWL annotation property.
 *
 * @see org.semanticweb.owlapi.model.OWLAnnotationProperty
 */
public class AP extends P
{
	public AP(String propertyID)
	{
		super(propertyID);
	}

	/**
	 * We have no way of anticipating the return types of built-ins in rules so we need to perform a runtime check.
	 */
	public AP(BA ba)
	{
		super("<InProcess>");

		if (ba instanceof AP) {
			AP p = (AP)ba;
			setId(p.getName());
		} else
			throw new RuntimeException("expecting OWL annotation property from bound built-in argument, got "
					+ ba.getClass().getCanonicalName());
	}

	@Override
	public OWLAnnotationProperty extract(DroolsOWLEntityExtractor extractor) throws TargetRuleEngineException
	{
		return extractor.extract(this);
	}

	@Override
	public SWRLBuiltInArgument extract(DroolsAA2SWRLAtomArgumentExtractor extractor) throws TargetRuleEngineException
	{
		return extractor.extract(this);
	}
}
