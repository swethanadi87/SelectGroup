/**
 * 
 */
package com.rp.service.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rp.service.model.RPServiceResponse;

/**
 * Handle all custom generated exception
 *
 */
@ControllerAdvice
public class RPServiceExceptionHandler {

	@ExceptionHandler({ CustomErrorException.class })
	public @ResponseBody RPServiceResponse handleCustomErrorException(HttpServletRequest requset,
			HttpServletResponse response, Exception e) {
		RPServiceResponse rPServiceResponse = new RPServiceResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Something bad happened, please contact system admin.",
				"");
		return rPServiceResponse;
	}
	
	@ExceptionHandler({ DateParseErrorException.class })
	public @ResponseBody RPServiceResponse handleDateParseException(HttpServletRequest requset,
			HttpServletResponse response, Exception e) {
		RPServiceResponse rPServiceResponse = new RPServiceResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Error while parsing the date",
				"");
		return rPServiceResponse;
	}

}
