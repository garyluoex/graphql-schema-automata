package com.gqlolap.automata.pipeline.initialize;

import com.gqlolap.automata.pipeline.PipelineEnvironment;
import com.gqlolap.automata.pipeline.PipelineStages;
import graphql.schema.idl.TypeDefinitionRegistry;

/**
 * TODO.
 */
public class InitializedEnvironment implements PipelineEnvironment {

  private final TypeDefinitionRegistry sourceDefinitionRegistry;
  private final TypeDefinitionRegistry hogsStaticDefinitionRegistry;

  public InitializedEnvironment(TypeDefinitionRegistry sourceDefinitionRegistry,
      TypeDefinitionRegistry staticDefinitionRegistry) {
    this.sourceDefinitionRegistry = sourceDefinitionRegistry;
    this.hogsStaticDefinitionRegistry = staticDefinitionRegistry;
  }

  public TypeDefinitionRegistry getStaticTypeDefinitionRegistry() {
    return hogsStaticDefinitionRegistry;
  }

  public TypeDefinitionRegistry getSourceTypeDefinitionRegistry() {
    return sourceDefinitionRegistry;
  }

  @Override
  public PipelineStages getStage() {
    return PipelineStages.initialize;
  }
}
