package org.swrlapi.drools.owl.classes;

import checkers.nullness.quals.NonNull;
import org.swrlapi.drools.owl.core.DroolsTernaryObject;

/**
 * This class represents an OWL object all values from class expression in Drools.
 *
 * @see org.semanticweb.owlapi.model.OWLObjectAllValuesFrom
 */
public class OAVFCE extends DroolsTernaryObject<String, String, String> implements CE
{
  private static final long serialVersionUID = 1L;

  public OAVFCE(@NonNull String ceid, @NonNull String propertyID, @NonNull String valueClassID)
  {
    super(ceid, propertyID, valueClassID);
  }

  @NonNull @Override
  public String getceid()
  {
    return getT1();
  }

  @NonNull public String getpid()
  {
    return getT2();
  }

  @NonNull public String getV()
  {
    return getT3();
  }

  @NonNull @Override
  public String toString()
  {
    return "OAVFCE" + super.toString();
  }
}
