package com.d1;

import java.util.Scanner;

public class Qn2058Re {

	/*
	 *하나의 자연수를 입력 받아 각 자릿수의 합을 계산하는 프로그램을 작성하라.
		[제약 사항]
		자연수 N은 1부터 9999까지의 자연수이다. (1 ≤ N ≤ 9999)
		
		[입력]
		입력으로 자연수 N이 주어진다.
		
		[출력]
		각 자릿수의 합을 출력한다. 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*//곱씹어볼 풀이다.
	    String string=sc.nextLine();
        int total=0;
        for(int i=0; i<string.length(); i++) {
            total+=string.charAt(i)-'0';			//문자1을 숫자1로 바꾸고 싶으면 숫자1이 아스키코드값 49이므로 '0'은 아스키코드48
        }											//문자i - '0'or48 하면 숫자가 남음
        System.out.println(total);
		*/
		
		int val = sc.nextInt();
		int sum = 0;
		while(val>0) {
			sum += val%10;
			val=val/10;
		}
		System.out.println(sum);
	}
	
}
