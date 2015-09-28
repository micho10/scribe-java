package org.scribe.builder.api;

import org.scribe.model.*;

public class XingApi extends DefaultApi10a
{
  private static final String AUTHORIZE_URL = "https://api.xing.com/v1/authorize?oauth_token=%s";

  /**
   * {@inheritDoc}
   */
  @Override
  public String getAccessTokenEndpoint()
  {
    return "https://api.xing.com/v1/access_token";
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getRequestTokenEndpoint()
  {
    return "https://api.xing.com/v1/request_token";
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getAuthorizationUrl(Token requestToken)
  {
    return String.format(AUTHORIZE_URL, requestToken.getToken());
  }
  
}
