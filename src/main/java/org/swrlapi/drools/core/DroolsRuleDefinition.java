package org.swrlapi.drools.core;

import checkers.nullness.quals.NonNull;

public class DroolsRuleDefinition
{
  @NonNull private final String ruleName, ruleText;

  public DroolsRuleDefinition(@NonNull String ruleName, @NonNull String ruleText)
  {
    this.ruleName = ruleName;
    this.ruleText = ruleText;
  }

  @NonNull public String getRuleName()
  {
    return this.ruleName;
  }

  @NonNull public String getRuleText()
  {
    return this.ruleText;
  }
}
