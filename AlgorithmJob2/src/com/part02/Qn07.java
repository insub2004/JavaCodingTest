package com.part02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Qn07 {

	//Binary
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String str = "";
		
		while(num>0) {
			str += num%2 + "";
			num = num/2;
		}

		for(int i=str.length()-1; i>=0; i--) {
			System.out.printf("%c", str.charAt(i));
		}
		
	}
}
