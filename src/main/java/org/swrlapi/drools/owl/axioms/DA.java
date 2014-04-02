package org.swrlapi.drools.owl.axioms;

import org.swrlapi.drools.owl.DroolsUnaryObject;
import org.swrlapi.drools.owl.entities.OE;

/**
 * Base class representing an OWL declaration axiom.
 */
public abstract class DA<T1 extends OE> extends DroolsUnaryObject<T1> implements A
{
	public DA(T1 entity)
	{
		super(entity);
	}

	public T1 getE()
	{
		return getT1();
	}
}