package com.hibernate.utility;

public class AvailabilityCriteriaException extends Exception{
    String name;
    public AvailabilityCriteriaException(String message)
    {
    	super(message);
    }
}