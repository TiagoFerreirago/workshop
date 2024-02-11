package br.com.universelife.course.controller.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.universelife.course.Service.exception.resourcenotfoundexception.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError>notFound(ResourceNotFoundException e, HttpServletRequest request){
		String error = "Not Found Exception";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError msg = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(msg);
	}
}
