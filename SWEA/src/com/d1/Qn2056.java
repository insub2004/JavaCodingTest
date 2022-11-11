package com.d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Qn2056 {

	//	연월일 달력
	/*
	 * 해당 날짜의 유효성을 판단한 후, 날짜가 유효하다면

		[그림1] 과 같이 ”YYYY/MM/DD”형식으로 출력하고,
		
		날짜가 유효하지 않을 경우, -1 을 출력하는 프로그램을 작성하라.
		홀수달 1~31일
		짝수달 1~30일
		2월은 항상 28일로 판단
		
		1) 월이 1~12 값이 아닌 경우
		2) 일이 해당 월에 맞지 않는 경우
		
		
	 */
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		
		
		for(int i=0; i<T; i++) {
			int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
			String str = sc.next();
			int year = Integer.parseInt(str.substring(0, 4));	// 주의! subString해서 parseint하면 0이 앞자리에 있으면 없셈
			//System.out.println(year);
			int month = Integer.parseInt(str.substring(4, 6));
			//System.out.println(month);
			int day = Integer.parseInt(str.substring(6));
			//System.out.println(day);
			
			
			if(month<=0 || month>12 || days[month-1] <day) System.out.printf("#%d -1 \n", i+1);
			else System.out.printf("#%d %s/%s/%s \n", i+1,str.substring(0, 4),str.substring(4, 6),str.substring(6));
		}
		
	}
	
}
