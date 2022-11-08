package com.part06;

import java.util.Scanner;

public class StringContain {

	// 특정 문자열이 해당 문자열에 포함되어 있는지 YES NO 출력
	/*
	 *  1) contains() -> 대소문자 비교하므로, 
   		구분 안하려면 str1.toLowerCase().contains(str2.toLowerCase())
				   str1.toUpperCase().contains(str3.toUpperCase())
				   
		2) indexOf() -> 특정 문자열이 존재하면 첫번째 인덱스 반환 그렇지 않음 -1반환
        indexOf("dwd", 숫자) -> 특정 인덱스부터 문자열을 찾고 싶다면 두 번쨰 인수로 위치전달
        
        3)lastIndexOf() 메서드는 문자열의 마지막 위치에서 특정 문자열을 검색
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String st01 = sc.next();
		String st02 = sc.next();
		
		if(st01.contains(st02)) System.out.println("YES");
		else System.out.println("NO");
	}
}
