package com.part06;

import java.util.Scanner;

public class Strlen {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//char data = sc.next().charAt(0);
		//System.out.println(data);
		
		char datas[] = new char[100];
		datas = sc.next().toCharArray();
		//System.out.println(datas.length);		//hello 입력시 5

		
		String str = "World";
		String strarr[] = str.split("");		//한글자씩 잘라서 넣기
		for(int i=0; i<strarr.length; i++) {
			System.out.println(strarr[i]);
		}
		
		char chararr[] = str.toCharArray();		//toCharArray를 이용해서 문자열을 char배열에 한 글자씩 저장
		for(int i=0; i<strarr.length; i++) {
			System.out.println(chararr[i]);
		}
	}
}
