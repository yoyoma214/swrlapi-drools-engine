package org.swrlapi.drools;

import org.swrlapi.bridge.SWRLRuleEngineBridge;
import org.swrlapi.bridge.TargetRuleEngine;
import org.swrlapi.core.SWRLRuleEngineManager;
import org.swrlapi.exceptions.TargetRuleEngineException;

/**
 * Creator class that is supplied to a {@link SWRLRuleEngineManager} to create new instances of a
 * {@link DroolsSWRLRuleEngine}.
 */
public class DroolsSWRLRuleEngineCreator implements SWRLRuleEngineManager.TargetSWRLRuleEngineCreator
{
	private static final String RULE_ENGINE_NAME = "Drools";

	@Override
	public String getRuleEngineName()
	{
		return RULE_ENGINE_NAME;
	}

	@Override
	public TargetRuleEngine create(SWRLRuleEngineBridge bridge) throws TargetRuleEngineException
	{
		return new DroolsSWRLRuleEngine(bridge);
	}
}
