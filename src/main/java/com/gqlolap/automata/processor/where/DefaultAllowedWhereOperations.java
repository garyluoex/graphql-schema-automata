package com.gqlolap.automata.processor.where;

import com.gqlolap.automata.HelperMethods;
import graphql.language.Type;
import graphql.schema.idl.TypeDefinitionRegistry;
import java.util.Arrays;
import java.util.List;

public enum DefaultAllowedWhereOperations {
  the_("Object"),
  _is("String", "Int"),
  _isNot("String", "Int"),
  _contains("String"),
  _notContains("String"),
  //  _between("Int", "FLoat"),
  _greaterThan("Int", "Float"),
  _lessThan("Int", "Float"),
  _greaterOrEquals("Int", "Float"),
  _lessOrEquals("Int", "Float");

  private List<String> validOnType;

  DefaultAllowedWhereOperations(String... validOnType) {
    this.validOnType = Arrays.asList(validOnType);
  }

  /**
   * TODO.
   * @param type TODO.
   * @param sourceTypeDefinitionRegistry TODO.
   * @return TODO.
   */
  public Boolean validOnType(Type type, TypeDefinitionRegistry sourceTypeDefinitionRegistry) {

    String effectiveType =
        sourceTypeDefinitionRegistry.isObjectType(type) ? "Object" : HelperMethods
            .serializeType(type);

    return validOnType.contains(effectiveType);
  }
}
