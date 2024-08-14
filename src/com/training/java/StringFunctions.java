package com.training.java;

public class StringFunctions {

	public static void main(String[] args) {
		String str = "Hello, World!";
        
        int length = str.length();
System.out.println("Length: " + length);

       char charAt = str.charAt(1);
System.out.println("Character at index 1: " + charAt);

        String substring = str.substring(7);
System.out.println("Substring from index 7: " + substring);

        String substringBetween = str.substring(7, 12);
System.out.println("Substring from index 7 to 12: " + substringBetween);


String concat = str.concat(" How are you?");
System.out.println("Concatenated string: " + concat);


String replaced = str.replace('o', 'a');
System.out.println("Replaced 'o' with 'a': " + replaced);


String upperCase = str.toUpperCase();
System.out.println("Uppercase: " + upperCase);


String lowerCase = str.toLowerCase();
System.out.println("Lowercase: " + lowerCase);


String strWithSpaces = "   Hello, World!   ";
String trimmed = strWithSpaces.trim();
System.out.println("Trimmed: '" + trimmed + "'");


boolean contains = str.contains("World");
System.out.println("Contains 'World': " + contains);


int indexOf = str.indexOf('o');
System.out.println("Index of 'o': " + indexOf);


int lastIndexOf = str.lastIndexOf('o');
System.out.println("Last index of 'o': " + lastIndexOf);


boolean isEmpty = str.isEmpty();
System.out.println("Is empty: " + isEmpty);


boolean equals = str.equals("Hello, World!");
System.out.println("Equals 'Hello, World!': " + equals);


boolean equalsIgnoreCase = str.equalsIgnoreCase("hello, world!");
System.out.println("Equals ignoring case 'hello, world!': " + equalsIgnoreCase);


int compareTo = str.compareTo("Hello, World!");
System.out.println("Compare to 'Hello, World!': " + compareTo);


String[] split = str.split(",");
System.out.println("Split by ',':");
for (String s : split) {
    System.out.println(s);
}


String joined = String.join("-", "Hello", "World", "Java");
System.out.println("Joined string: " + joined);


String formatted = String.format("This is a %s with %d functions", "String", 19);
System.out.println("Formatted string: " + formatted);


char[] charArray = str.toCharArray();
System.out.println("Char array:");
for (char c : charArray) {
    System.out.println(c);
}


String interned = str.intern();
System.out.println("Interned string: " + interned);

	}

}
