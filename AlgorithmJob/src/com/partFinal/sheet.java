package com.partFinal;

import java.util.Scanner;

public class sheet {
	
	public static void main(String[] args) {

		
		String st = "1r2t4d";
		char[] arr = new char[2010];
		
		for(int i=0; i<st.length(); i++) {
			arr[i] = st.charAt(i);
		}
		char a = st.charAt(0);
		System.out.println(a+1);
		int b = Character.getNumericValue(st.charAt(0));
		System.out.println(b+1);
		
		
	}
}
