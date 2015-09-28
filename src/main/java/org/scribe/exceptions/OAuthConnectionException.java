package org.scribe.exceptions;

/**
 * @author Pablo Fernandez
 */
public class OAuthConnectionException extends OAuthException
{
  private static final String MSG = "There was a problem while creating a connection to the remote service.";

  /**
   * Constructor.
   *
   * @param e original exception
   */
  public OAuthConnectionException(Exception e)
  {
    super(MSG, e);
  }
}
