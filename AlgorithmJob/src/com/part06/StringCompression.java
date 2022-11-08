package com.part06;

import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String res = "";
		
		char[]arr = str.toCharArray();
		
		char []p = new char[1];			// 비교할 때 사용할 char[]변수
		int cnt = 1;					// 갯수는 1개 부터 세기
		p[0] = arr[0];				    // 먼저 제일 앞에 있는 문자 하나 담아주고 시작
		
		
		for(int i=1; i<arr.length; i++) {				// 1부터 끝까지 탐색
			if(p[0] == arr[i]) cnt++;					// 비교문자와 같으면 cnt++
			else if(p[0] != arr[i] && cnt == 1) {		// 비교문자와 같지 않으면서 cnt가 1이면 => 문자 하나만 있으면		
				res += String.valueOf(p[0]);			// cnt는 제외하고 출력 문자열에 문자만 담기 
				p[0] = arr[i];							// 비교 문자 바꿔주고
				cnt = 1;								// 증감식에 의해 어차피 하나 뒤에꺼부터 비교하니 1부터 세기
			}else {										// 비교문자와 같지 않으면 출력 문자열에 cnt와 비교문자 안의 문자 연속해서 넣기
				res += String.valueOf(cnt) + String.valueOf(p[0]);
				p[0] = arr[i];							// 넣고 비교문자 변경
				cnt = 1;								// 증감식에 의해 어차피 하나 뒤에꺼부터 비교하니 1부터 세기
			}
		}
		if(cnt != 1) res += String.valueOf(cnt) + String.valueOf(p[0]);	// 마지막 최종에 있던 값 담아주기
		else res += String.valueOf(p[0]);
		
		System.out.println(res);
		
	}
}
