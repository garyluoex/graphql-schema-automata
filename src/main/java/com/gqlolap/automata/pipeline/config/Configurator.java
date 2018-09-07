package com.gqlolap.automata.pipeline.config;

import com.gqlolap.automata.Component;
import com.gqlolap.automata.pipeline.initialize.InitializedEnvironment;

/**
 * Created by weijialuo on 7/3/18.
 */
public interface Configurator extends Component {

  ConfiguredEnvironment configure(InitializedEnvironment initializedEnvironment);
}
