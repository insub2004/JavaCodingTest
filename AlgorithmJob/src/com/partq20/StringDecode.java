package com.partq20;

import java.util.Scanner;

public class StringDecode {

	// 26분 걸림
	// char 배열 초기화시 디폴트 값은 '\0'인 것 기억하자
	// char'숫자'-'0'은 int로 반환된다.
	// Character.getNumericValue() 이게 있네???;;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			
			String st = sc.next();				// 문자열 입력 받기
			char[] arr = new char[2010];		// st 문자열을 하나씩 char로 쪼개서 넣을 배열
			String ans = "";					// 정답에 쓸 문자열 변수
			
			for(int i=0; i<st.length(); i++) {
				arr[i] = st.charAt(i);			// char arr[] 배열에 담기
			}

			for(int i=0; arr[i]!='\0'; i++) {
				int val = arr[i] - '0';			// 만약 char'숫자'에서 '0'을 빼면 1~9사이가 나온다
				if(val>=1 && val<=9) {			// 1~9사이면
					for(int j=1; j<val; j++) {	
						ans += arr[i+1];		// 숫자만큼 ans에 숫자뒤에 있는 문자열을 담아주기
					}
				}else {
					ans += arr[i];				// 만약에 1~9가 아니면 숫자가 아니므로 해당 문자를
				}								// 그냥 하나 ans에 담아주기
			}
			System.out.printf("#%d %s\n", t, ans);	//출력
		}
	}
}
