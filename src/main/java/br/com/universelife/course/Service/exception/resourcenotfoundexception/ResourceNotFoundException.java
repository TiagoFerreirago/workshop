package br.com.universelife.course.Service.exception.resourcenotfoundexception;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("Resource not found "+id);
	}

}
