package com.gqlolap.automata.serializer;

import com.gqlolap.automata.HelperMethods;
import graphql.language.Document;
import graphql.schema.idl.SchemaPrinter;
import graphql.schema.idl.TypeDefinitionRegistry;

public class GraphqlSchemaPrinter implements SchemaSerializer {

  @Override
  public String serialize(TypeDefinitionRegistry typeDefinitionRegistry) {
    Document document = new Document(HelperMethods.getAllDefinitions(typeDefinitionRegistry));
    SchemaPrinter schemaPrinter = new SchemaPrinter();
    return schemaPrinter.print(document);
  }
}
