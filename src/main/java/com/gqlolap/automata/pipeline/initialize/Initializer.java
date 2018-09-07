package com.gqlolap.automata.pipeline.initialize;

import com.gqlolap.automata.Component;
import graphql.schema.idl.TypeDefinitionRegistry;

/**
 * TODO.
 */
public interface Initializer extends Component {

  InitializedEnvironment initialize(TypeDefinitionRegistry sourceRegistry);
}
