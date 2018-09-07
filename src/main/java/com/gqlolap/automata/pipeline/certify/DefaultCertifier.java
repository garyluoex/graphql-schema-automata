package com.gqlolap.automata.pipeline.certify;

import com.gqlolap.automata.pipeline.generate.GeneratedEnvironment;
import com.gqlolap.automata.processor.Processor;


/**
 * Created by weijialuo on 7/2/18.
 */
public class DefaultCertifier implements Certifier {

  @Override
  public CertifiedEnvironment certify(final GeneratedEnvironment generatedEnvironment) {

    CertifiedEnvironment certifiedEnvironment = new CertifiedEnvironment(generatedEnvironment);

    for (Processor processor : certifiedEnvironment.getConfiguredProcessors().values()) {
      certifiedEnvironment = processor.certify(certifiedEnvironment);
    }

    return certifiedEnvironment;
  }
}
