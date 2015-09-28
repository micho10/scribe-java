package org.scribe.builder.api;

import org.scribe.model.*;

/**
 * @author Arieh "Vainolo" Bibliowicz
 * @link http://apidocs.mendeley.com/home/authentication
 */
public class MendeleyApi extends DefaultApi10a 
{

  private static final String AUTHORIZATION_URL = "http://api.mendeley.com/oauth/authorize?oauth_token=%s";

  /**
   * {@inheritDoc}
   */
  @Override
  public String getRequestTokenEndpoint() 
  {
    return "http://api.mendeley.com/oauth/request_token/";
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getAccessTokenEndpoint()  
  {
    return "http://api.mendeley.com/oauth/access_token/";
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
  public Verb getAccessTokenVerb() 
  {
    return Verb.GET;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Verb getRequestTokenVerb() 
  {
    return Verb.GET;
  }
}
