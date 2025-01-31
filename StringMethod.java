import java.util.*;

class StringMethod {
	public static void main(String[] args){
		String Akash = "SaLeKar";
		String s1 = "Arjun is memepage admin";
		
		System.out.println(Akash.length());

		// upper case and lower case method
		System.out.println(Akash.toUpperCase());
		System.out.println(Akash.toLowerCase());

		System.out.println(s1.indexOf("memepage"));

		// String Concatenation
// The + operator can be used between strings to combine them. 
// This is called concatenation:

		String firstname = "arjun";
		String lastname =  "Kandekar";

		System.out.println(firstname + " " + lastname);

		// we can also use concat() method to concat two
		// Strings
		System.out.println(firstname.concat(lastname));

// 		WARNING!

// Java uses the + operator for both addition and concatenation.

// Numbers are added. Strings are concatenated.
	}

}