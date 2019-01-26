package com.shree.containermgmt.Utils;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice(annotations=Controller.class)
public class GlobalControllerAdvice {
	
	@ExceptionHandler(NullPointerException.class)
	public String handleError(HttpServletRequest request) {
		return PageURL.GLOBAL_ERROR_PAGE;
	}
	
	@ExceptionHandler(RuntimeException.class)
	public String handleRunError(HttpServletRequest request) {
		return PageURL.GLOBAL_ERROR_PAGE;
	}
}
