/**
 * 
 */
package com.finance.controller;

import java.io.IOException;
import java.util.Date;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.finance.model.ExceptionDetails;

/**
 * @author Supriya
 *
 */
@ControllerAdvice
@RestController
public class GlobalExceptionController {
	
	/*@ExceptionHandler(Exception.class)
	public ExceptionDetails handleCustomException(Exception ex) {

		ExceptionDetails exceptionObj = new ExceptionDetails(new Date(), ex.getLocalizedMessage(), ex.getStackTrace().toString());
		
		return exceptionObj;

	}*/
	
	@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="IOException occured")
	@ExceptionHandler(IOException.class)
	public ExceptionDetails handleIOException(IOException ex){
		ExceptionDetails exceptionObj = new ExceptionDetails(new Date(), "No Data Provided" , ex.getStackTrace().toString());
		return exceptionObj;
	}
	
	@ResponseStatus(value=HttpStatus.BAD_REQUEST, reason="Request is not in proper format")
	@ExceptionHandler(HttpMessageNotReadableException.class)
	public ExceptionDetails handleBadRequestException(HttpMessageNotReadableException ex){
		
		ExceptionDetails exceptionObj = new ExceptionDetails(new Date(), "Input Data is not in Correct format", ex.getStackTrace().toString());
		return exceptionObj;
		
	}
	
	@ResponseStatus(value=HttpStatus.METHOD_NOT_ALLOWED, reason="This request does not support GET method. Please provide data in input and Click 'Submit'")
	@ExceptionHandler(UnsupportedOperationException.class)
	public ExceptionDetails handleMethodNotSupportedException(UnsupportedOperationException ex){
		
		ExceptionDetails exceptionObj = new ExceptionDetails(new Date(), "This request does not support GET method", "This request does not support GET method");
		return exceptionObj;
		
	}
	
	@ResponseStatus(value=HttpStatus.METHOD_NOT_ALLOWED, reason="This request does not support GET method. Please provide data in input and Click 'Submit'")
	@ExceptionHandler(ApplicationException.class)
	public ExceptionDetails handleNotSupportedException(ApplicationException ex){
		
		ExceptionDetails exceptionObj = new ExceptionDetails(new Date(), "This request does not support GET method", "This request does not support GET method");
		return exceptionObj;
		
	}


}
