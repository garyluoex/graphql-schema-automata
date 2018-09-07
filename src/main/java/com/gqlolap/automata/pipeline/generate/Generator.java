package com.gqlolap.automata.pipeline.generate;

import com.gqlolap.automata.Component;
import com.gqlolap.automata.pipeline.validate.ValidatedEnvironment;

/**
 * TODO.
 */
public interface Generator extends Component {

  GeneratedEnvironment generate(ValidatedEnvironment validatedEnvironment);
}
