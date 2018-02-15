/**
 * 
 */
package com.finance.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.finance.constants.ApplicationConstants;
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
	
	@ResponseStatus(value=HttpStatus.BAD_REQUEST)
	@ExceptionHandler(HttpMessageNotReadableException.class)
	public ExceptionDetails handleBadRequestException(HttpMessageNotReadableException ex){
		
		ExceptionDetails exceptionObj = new ExceptionDetails(new Date(), ApplicationConstants.APPLICATION_IMPROPER_REQUEST_FORMAT_ERROR_MESSAGE, ex.getStackTrace().toString());
		return exceptionObj;
		
	}
	
	@ResponseStatus(value=HttpStatus.METHOD_NOT_ALLOWED)
	@ExceptionHandler(UnsupportedOperationException.class)
	public ExceptionDetails handleMethodNotSupportedException(UnsupportedOperationException ex){
		
		ExceptionDetails exceptionObj = new ExceptionDetails(new Date(), ApplicationConstants.APPLICATION_UNSUPPORTED_METHOD_ERROR_MESSAGE, ex.getStackTrace().toString());
		return exceptionObj;
		
	}
	
	@ResponseStatus(value=HttpStatus.METHOD_NOT_ALLOWED, reason=ApplicationConstants.APPLICATION_UNSUPPORTED_METHOD_ERROR_MESSAGE)
	@ExceptionHandler(ApplicationException.class)
	public ExceptionDetails handleNotSupportedException(ApplicationException ex){
		
		ExceptionDetails exceptionObj = new ExceptionDetails(new Date(), ApplicationConstants.APPLICATION_UNSUPPORTED_METHOD_ERROR_MESSAGE, ex.getStackTrace().toString());
		return exceptionObj;
		
	}

	
	@ExceptionHandler(ParseException.class)
	public ExceptionDetails handleparseException(ParseException ex){
		
		ExceptionDetails exceptionObj = new ExceptionDetails(new Date(), ApplicationConstants.APPLICATION_DATE_FORMAT_YYYY_MM_DD_ERROR_MESSAGE, ex.getStackTrace().toString());
		return exceptionObj;
		
	}
}
