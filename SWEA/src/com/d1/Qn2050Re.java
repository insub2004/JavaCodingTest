package com.d1;

import java.util.Scanner;

public class Qn2050Re {

	//
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String st = sc.next();
		
		for(int i=0; i<st.length(); i++) {
			System.out.print((st.charAt(i)-64)+" ");
		}
		
	}
}
