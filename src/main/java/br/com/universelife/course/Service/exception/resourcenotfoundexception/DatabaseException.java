package br.com.universelife.course.Service.exception.resourcenotfoundexception;

public class DatabaseException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;
	
	public DatabaseException(String msg) {
		super(msg);
	}

}
