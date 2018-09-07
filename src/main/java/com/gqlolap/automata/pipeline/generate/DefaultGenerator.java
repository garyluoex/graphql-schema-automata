package com.gqlolap.automata.pipeline.generate;

import com.gqlolap.automata.pipeline.validate.ValidatedEnvironment;
import com.gqlolap.automata.processor.Processor;
import graphql.schema.idl.TypeDefinitionRegistry;

/**
 * TODO.
 */
public class DefaultGenerator implements Generator {

  @Override
  public GeneratedEnvironment generate(final ValidatedEnvironment validatedEnvironment) {

    TypeDefinitionRegistry generatedTypeDefinitionRegistry = validatedEnvironment
        .getSourceTypeDefinitionRegistry()
        .merge(validatedEnvironment.getStaticTypeDefinitionRegistry());

    GeneratedEnvironment generatedEnvironment = new GeneratedEnvironment(validatedEnvironment,
        generatedTypeDefinitionRegistry);

    for (Processor processor : validatedEnvironment.getConfiguredProcessors().values()) {
      generatedEnvironment = processor.generate(generatedEnvironment);
    }

    return generatedEnvironment;
  }
}

