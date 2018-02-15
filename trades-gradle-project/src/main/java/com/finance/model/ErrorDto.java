/**
 * 
 */
package com.finance.model;

/**
 * @author Supriya
 *
 */
public class ErrorDto {
	
	private String errorMsg;
	private String errorCode;
	private String errorClass;
	
	public ErrorDto(String errorMsg, String errorCode, String errorClass) {
		super();
		this.errorMsg = errorMsg;
		this.errorCode = errorCode;
		this.errorClass = errorClass;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorClass() {
		return errorClass;
	}
	public void setErrorClass(String errorClass) {
		this.errorClass = errorClass;
	}
	
	

}
