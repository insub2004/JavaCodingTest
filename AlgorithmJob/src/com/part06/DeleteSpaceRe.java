package com.part06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DeleteSpaceRe {

	// 입력된 문자열의 공백을 지우기
	
	public static void main(String[] args) throws IOException {
		
		/*
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		char[] arr = str.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==32) continue;
			System.out.printf("%c",arr[i]);
		}
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = (String)br.readLine();
		String[] strarr = str.split(" ");
		/*
		System.out.println(strarr.length);
		for(int i=0; i<strarr.length; i++) {
			System.out.printf("%s",strarr[i]);
		}
		*/
		//System.out.println(strarr[2]);
		String resstr = "";
		for(int i=0; i<strarr.length; i++) {
			resstr += strarr[i];
		}
		resstr = resstr + String.valueOf(3);
		System.out.println(resstr);
	}
	
}
