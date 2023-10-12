package com.tns.exceptions;

public class NestedTry{
	public static void check () {
		String str="tns";
				int slength=str.length();
		System.out.println("the length is"+slength);
		String anotherString="hello";
		int y=6;
		try {
			int z=y/0;
		try {
			System.out.println("the length is"+ slength);//exception arises
			 
		}
		catch(StringIndexOutOfBoundsException ex) {// inner catch
			System.out.println("Indexout of bound"+ex.getMessage());
		}
		catch(NullPointerException ex) {
		System.out.println("index out of bound"+ex.getMessage());
		}
	}

catch(ArithmeticException ex) {
	System.out.println("Arithematic exception"+ex.getMessage());
}
	}
}

