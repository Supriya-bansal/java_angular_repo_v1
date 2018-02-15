/**
 * 
 */
package com.finance.model;

/**
 * @author Supriya
 *
 */
import java.util.Date;

@SuppressWarnings("serial")
public class ExceptionDetails extends Exception{
  private Date timestamp;
  private String message;
  private String details;

  public ExceptionDetails(Date timestamp, String message, String details) {
    super();
    this.timestamp = timestamp;
    this.message = message;
    this.details = details;
  }

  public ExceptionDetails() {
	
}

public Date getTimestamp() {
    return timestamp;
  }

  public String getMessage() {
    return message;
  }

  public String getDetails() {
    return details;
  }

}