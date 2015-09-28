package org.scribe.builder.api;

import org.scribe.model.*;

public class DropBoxApi extends DefaultApi10a
{
  /**
   * {@inheritDoc}
   */
  @Override
  public String getAccessTokenEndpoint()
  {
    return "https://api.dropbox.com/1/oauth/access_token";
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getAuthorizationUrl(Token requestToken)
  {
    return "https://www.dropbox.com/1/oauth/authorize?oauth_token="+requestToken.getToken();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getRequestTokenEndpoint()
  {
    return "https://api.dropbox.com/1/oauth/request_token";
  }

}