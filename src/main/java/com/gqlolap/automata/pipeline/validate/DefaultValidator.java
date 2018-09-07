package com.gqlolap.automata.pipeline.validate;

import com.gqlolap.automata.pipeline.config.ConfiguredEnvironment;
import com.gqlolap.automata.processor.Processor;

/**
 * TODO.
 */
public class DefaultValidator implements Validator {

  @Override
  public ValidatedEnvironment validate(final ConfiguredEnvironment configuredEnvironment) {

    ValidatedEnvironment validatedEnvironment = new ValidatedEnvironment(configuredEnvironment);

    for (Processor processor : configuredEnvironment.getConfiguredProcessors().values()) {
      validatedEnvironment = processor.validate(validatedEnvironment);
    }
    return validatedEnvironment;
  }
}
