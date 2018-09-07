package com.gqlolap.automata.pipeline.certify;

import com.gqlolap.automata.Component;
import com.gqlolap.automata.pipeline.generate.GeneratedEnvironment;

/**
 * Created by weijialuo on 7/3/18.
 */
public interface Certifier extends Component {

  CertifiedEnvironment certify(GeneratedEnvironment generatedEnvironment);
}
