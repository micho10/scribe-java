package org.scribe.builder.api;

import org.scribe.model.*;

public class Px500Api extends DefaultApi10a
{
  private static final String AUTHORIZATION_URL = "https://api.500px.com/v1/oauth/authorize?oauth_token=%s";

  /**
   * {@inheritDoc}
   */
  @Override
  public String getAccessTokenEndpoint()
  {
    return "https://api.500px.com/v1/oauth/access_token";
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getRequestTokenEndpoint()
  {
    return "https://api.500px.com/v1/oauth/request_token";
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getAuthorizationUrl(Token requestToken)
  {
    return String.format(AUTHORIZATION_URL, requestToken.getToken());
  }
}