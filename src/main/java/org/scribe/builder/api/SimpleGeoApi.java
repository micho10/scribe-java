package org.scribe.builder.api;

import org.scribe.model.Token;

/**
 * @author: Pablo Fernandez
 */
public class SimpleGeoApi extends DefaultApi10a
{
  private static final String ENDPOINT = "these are not used since SimpleGeo uses 2 legged OAuth";

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getRequestTokenEndpoint()
	{
		return ENDPOINT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getAccessTokenEndpoint()
	{
		return ENDPOINT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getAuthorizationUrl(Token requestToken)
	{
		return ENDPOINT;
	}
}
