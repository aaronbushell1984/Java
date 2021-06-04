package com.fdmgroup.ood.datatypes;

public class DemoWrappers {

	public static void main(String[] args) {
		int primativeInt = 123;
		
		// Deprecated declaration
		Integer myInteger = new Integer(primativeInt);
		
		myInteger = Integer.parseInt("123");
		System.out.println("myInteger = " + myInteger);
		
		// This 
		Integer anotherInteger = Integer.parseInt("456");
		int result = myInteger.intValue() + anotherInteger.intValue();
		System.out.println(result);
		
		String someBoolean = "true";
		Boolean what = Boolean.valueOf(someBoolean);
		System.out.println("what = " + what);

	}

}
