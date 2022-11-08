package com.part06;

import java.util.Scanner;

public class UpperLowerStr {

	// 대문자는 소문자로 소문자는 대문자로 변환
	// 알파벳이 아닌 문자는 넘긴다.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();			//띄어쓰기가 있는 라인은 nextLine()으로 입력받기!!!!
		
		char arr[] = str.toCharArray();
		
		//System.out.println(arr.length);
		
		for(int i=0; i<arr.length; i++) {
			if(Character.isUpperCase(arr[i])) arr[i] = Character.toLowerCase(arr[i]);
			else if(Character.isLowerCase(arr[i])) arr[i] = Character.toUpperCase(arr[i]);
			else continue;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	
}
