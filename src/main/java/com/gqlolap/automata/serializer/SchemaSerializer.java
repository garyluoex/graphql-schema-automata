package com.gqlolap.automata.serializer;

import com.gqlolap.automata.Component;
import graphql.schema.idl.TypeDefinitionRegistry;

public interface SchemaSerializer extends Component {

  String serialize(TypeDefinitionRegistry typeDefinitionRegistry);

}
