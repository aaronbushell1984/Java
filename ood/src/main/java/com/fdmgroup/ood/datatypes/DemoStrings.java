package com.fdmgroup.ood.datatypes;

public class DemoStrings {

	public static void main(String[] args) {
		String name = "Aaron";
		String anotherName = "Aaron";
		
		// One piece of memory is created - Only the reference name changed=s
		boolean isSameObject = name == anotherName;
		System.out.println("References the same object -" + isSameObject);
		
		// Most of the time it is the contents that needs checking and not the reference
		boolean isSameData = name.equals(anotherName);
		System.out.println("Is same Data? " + isSameData);
		
		// String concatenation can be slow because of immutability - A new temporary copy string is created for each part
		String yetAnotherName = name + " " + anotherName;
		System.out.println(yetAnotherName);
		
		// capture result of method and then use it
		String myBigString = buildABigString();
		System.out.println(myBigString);
		
		// directly use result and chain method
		System.out.println(buildABigString());
		
		// String Methods
		
		// Strings are immutable so name is printed capitalised but name variable remain unchanged
		System.out.println(name.toUpperCase());
		System.out.println(name);
		
		System.out.println(name.charAt(2));
		System.out.println(name.substring(1, 3));
		
		int indexOfV = name.indexOf('V');
		System.out.println(name.substring(indexOfV));
		
		System.out.println(name.toLowerCase().replace("r", "d"));
	}
	
	// StringBuilder - quickest for single thread applications
	// StringBuffer - slower but for multi-threaded applications
	public static String buildABigString() {
		StringBuilder builder = new StringBuilder(1000);
		builder.append("A very big string ");
		builder.append("A very big string ");
		builder.append("A very big string ");
		builder.append("A very big string ");
		builder.append("A very big string ");
		builder.append("A very big string ");
		return builder.toString();
	}

}
