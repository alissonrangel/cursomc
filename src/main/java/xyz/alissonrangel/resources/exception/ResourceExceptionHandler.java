package xyz.alissonrangel.resources.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import xyz.alissonrangel.services.exceptions.ObjectNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	
	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandartErro> objectNotFound(ObjectNotFoundException e, HttpServletRequest request){
		
		StandartErro err = new StandartErro(HttpStatus.NOT_FOUND.value(), e.getMessage(), System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}
	
	

}
