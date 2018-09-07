package com.gqlolap.automata.processor;

import com.gqlolap.automata.pipeline.certify.CertifiedEnvironment;
import com.gqlolap.automata.pipeline.config.ConfiguredEnvironment;
import com.gqlolap.automata.pipeline.generate.GeneratedEnvironment;
import com.gqlolap.automata.pipeline.validate.ValidatedEnvironment;


public interface Processor {

  default ConfiguredEnvironment configure(ConfiguredEnvironment configuredEnvironment) {
    return configuredEnvironment;
  }

  default ValidatedEnvironment validate(ValidatedEnvironment validatedEnvironment) {
    return validatedEnvironment;
  }

  default GeneratedEnvironment generate(GeneratedEnvironment generatedEnvironment) {
    return generatedEnvironment;
  }

  default CertifiedEnvironment certify(CertifiedEnvironment certifiedEnvironment) {
    return certifiedEnvironment;
  }
}
