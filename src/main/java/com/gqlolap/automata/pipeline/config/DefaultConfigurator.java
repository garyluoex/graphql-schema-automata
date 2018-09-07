package com.gqlolap.automata.pipeline.config;

import com.google.inject.Inject;
import com.gqlolap.automata.pipeline.initialize.InitializedEnvironment;
import com.gqlolap.automata.processor.Processor;
import java.util.Map;

/**
 * TODO.
 */
public class DefaultConfigurator implements Configurator {

  private final Map<String, Processor> configuredProcessors;

  @Inject
  public DefaultConfigurator(Map<String, Processor> configuredProcessors) {
    this.configuredProcessors = configuredProcessors;
  }

  @Override
  public ConfiguredEnvironment configure(final InitializedEnvironment initializedEnvironment) {

    ConfiguredEnvironment configuredEnvironment = new ConfiguredEnvironment(initializedEnvironment,
        configuredProcessors);

    for (Processor processor : configuredProcessors.values()) {
      configuredEnvironment = processor.configure(configuredEnvironment);
    }

    return configuredEnvironment;
  }
}
