package com.test;

public final class SomeOtherClass
{
	private final String value;

	public SomeOtherClass(final String value) { this.value = value; }

	public String performSomeOperation(final int i) { 
	
		if (i == 1) {
			return value + i * 2; 
		} else {
			return value + i; 	
		}
	
	}
	
	public void printMethod () {
	    System.out.println("Hello World !!!");
	}
}
