package com.gqlolap.automata.pipeline.validate;

import com.gqlolap.automata.pipeline.PipelineStages;
import com.gqlolap.automata.pipeline.config.ConfiguredEnvironment;

/**
 * TODO.
 */
public class ValidatedEnvironment extends ConfiguredEnvironment {

  private final ConfiguredEnvironment sourceConfiguredEnvironment;

  /**
   * TODO.
   *
   * @param sourceConfiguredEnvironment TODO
   */
  public ValidatedEnvironment(ConfiguredEnvironment sourceConfiguredEnvironment) {
    super(
        sourceConfiguredEnvironment.getSourceInitializedEnvironment(),
        sourceConfiguredEnvironment.getConfiguredProcessors());
    this.sourceConfiguredEnvironment = sourceConfiguredEnvironment;
  }

  /**
   * TODO.
   *
   * @return TODO
   */
  public ConfiguredEnvironment getSourceConfiguredEnvironment() {
    return sourceConfiguredEnvironment;
  }

  @Override
  public PipelineStages getStage() {
    return PipelineStages.validate;
  }
}
