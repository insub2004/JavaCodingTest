package com.part06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Palindrom {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String []st = br.readLine().split("");
		
		/*
		for(int i=0;i<st.length;i++) {
			System.out.print(st[i]);
		}
		*/
		
		bw.write(isPalindrome(st)? "YES":"NO");
		br.close();
		bw.flush();
		bw.close();
		
	}
	
	public static boolean isPalindrome(String[] str) {
		for(int i=0;i<str.length/2;i++) {
			if(!str[i].equals(str[str.length-1-i])) return false;
		}
		return true;
	}
}
