package com.d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Qn2047Re {

	// 신문 헤드라인
	
	public static void main(String[] args) throws IOException {
		
		//내 생각
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String st = bf.readLine();
		
		/*
		System.out.println(st.toUpperCase());
		*/
		
		//isLowerCase 와 향상for문이용 답
		String answer = "";
		for(char x:st.toCharArray()) {
			if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
			else answer += x;
		}
		System.out.println(answer);
		
	}
}
