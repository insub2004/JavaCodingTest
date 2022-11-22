package com.partq20;

import java.util.Scanner;

public class Hashing {

	public static void main(String[] args) {
		
		/*
		 * 16Áø¼ö ÆÁ
		 * 
		 * "12FA"
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String st = sc.nextLine();
		
		/*
		int[] ans = new int[st.length()];
		
		for(int i=0; i<arrChar.length; i++) {
			char ch = st.charAt(i);
			int a = ch-'A';
			ans[i] = a;
		}

		for(int i=0; i<ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
		*/
		char[] arrChar = new char[st.length()];
		for(int i=0; i<arrChar.length; i++) {
			arrChar[i] = st.charAt(i);
		}
		for(int i=0; i<arrChar.length; i++) {
			System.out.printf("%d ",arrChar[i]-'A');
		}
	}
}
