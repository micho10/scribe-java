package org.scribe.builder.api;

import org.scribe.model.*;
import org.scribe.oauth.*;

/**
 * Contains all the configuration needed to instantiate a valid {@link OAuthService}
 * 
 * @author Pablo Fernandez
 *
 */
public interface Api
{  
  /**
   * Creates an {@link OAuthService}
   *
   * @param config Object containing OAuth config values
   * @return fully configured {@link OAuthService}
   */
  OAuthService createService(OAuthConfig config);
}
