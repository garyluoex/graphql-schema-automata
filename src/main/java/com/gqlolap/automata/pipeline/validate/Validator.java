package com.gqlolap.automata.pipeline.validate;

import com.gqlolap.automata.Component;
import com.gqlolap.automata.pipeline.config.ConfiguredEnvironment;

/**
 * TODO.
 */
public interface Validator extends Component {

  ValidatedEnvironment validate(ConfiguredEnvironment configuredEnvironment);
}
