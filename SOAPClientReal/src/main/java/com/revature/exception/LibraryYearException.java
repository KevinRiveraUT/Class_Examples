package com.revature.exception;

/**
 * LibraryYearException
 */
public class LibraryYearException extends Exception{

    private static final long serialVersionUID = 1L;
	public LibraryYearException(){}
    public LibraryYearException(String message){
        super(message);
    }
}