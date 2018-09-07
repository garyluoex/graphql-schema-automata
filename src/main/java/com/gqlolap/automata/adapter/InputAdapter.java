package com.gqlolap.automata.adapter;

import com.gqlolap.automata.Component;
import graphql.schema.idl.TypeDefinitionRegistry;

/** Created by weijialuo on 7/2/18. */
public interface InputAdapter extends Component {

  TypeDefinitionRegistry getSourceTypeDefinitionRegistry();
}
