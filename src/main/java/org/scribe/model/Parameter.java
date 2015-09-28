package org.scribe.model;

import org.scribe.utils.*;

/**
 * @author Pablo Fernandez
 */
public class Parameter implements Comparable<Parameter>
{
  private static final String UTF = "UTF8";

  private final String key;
  private final String value;

  /**
   * Constructor.
   *
   * @param key of the parameter
   * @param value of the parameter
   */
  public Parameter(String key, String value)
  {
    this.key = key;
    this.value = value;
  }

  /**
   * Encode the parameter for a URL.
   *
   * @return the parameter as a URL.
   */
  public String asUrlEncodedPair()
  {
    return OAuthEncoder.encode(key).concat("=").concat(OAuthEncoder.encode(value));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean equals(Object other)
  {
    if(other == null) return false;
    if(other == this) return true;
    if(!(other instanceof Parameter)) return false;
    
    Parameter otherParam = (Parameter) other;
    return otherParam.key.equals(key) && otherParam.value.equals(value);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public int hashCode()
  {
    return key.hashCode() + value.hashCode();
  }

  /**
   * {@inheritDoc}
   */
  public int compareTo(Parameter parameter)
  {
    int keyDiff = key.compareTo(parameter.key);

    return keyDiff != 0 ? keyDiff : value.compareTo(parameter.value);
  }
}
