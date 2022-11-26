package ControlFlow;


//new class
public class AsciiChars {
	public static void printNumbers() {
		// TODO: print valid numeric input
		System.out.println("Here are all the numbers:");
		for(int i=48; i<=57; i++) {
			System.out.print((char)i);
		}
		System.out.println();
	}
	public static void printLowerCase() { 
		// TODO: print valid lowercase alphabetic input }
		System.out.println("Here are all the lower case letters:");
		for(int i=97; i<=122; i++) {
			System.out.print((char)i);
		}
		System.out.println();
	}
	public static void printUpperCase() { 
		// TODO: print valid uppercase alphabetic input } 
		System.out.println("Here are all the upper case letters:");
		for(int i=65; i<=90; i++) {
			System.out.print((char)i);
		}
		System.out.println();
	}
}


