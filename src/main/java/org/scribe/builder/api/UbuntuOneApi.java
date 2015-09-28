package org.scribe.builder.api;

import org.scribe.model.Token;
import org.scribe.services.*;

/**
 * @author Julio Gutierrez
 * 
 *         Sep 6, 2012
 */
public class UbuntuOneApi extends DefaultApi10a
{

  private static final String AUTHORIZATION_URL = "https://one.ubuntu.com/oauth/authorize/?oauth_token=%s";

  /**
   * {@inheritDoc}
   */
  @Override
  public String getAccessTokenEndpoint()
  {
    return "https://one.ubuntu.com/oauth/access/";
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getAuthorizationUrl(Token requestToken)
  {
    return String.format(AUTHORIZATION_URL, requestToken.getToken());
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getRequestTokenEndpoint()
  {
    return "https://one.ubuntu.com/oauth/request/";
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public SignatureService getSignatureService()
  {
    return new PlaintextSignatureService();
  }

}
