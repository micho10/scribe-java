package org.scribe.builder.api;

import org.scribe.model.Token;

public class VimeoApi extends DefaultApi10a
{
  private static final String AUTHORIZATION_URL = "http://vimeo.com/oauth/authorize?oauth_token=%s";

  /**
   * {@inheritDoc}
   */
  @Override
  public String getAccessTokenEndpoint()
  {
    return "http://vimeo.com/oauth/access_token";
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getRequestTokenEndpoint()
  {
    return "http://vimeo.com/oauth/request_token";
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
