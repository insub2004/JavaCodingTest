package com.part06;

import java.util.Scanner;

public class ReverseString {

	// 문자를 거꾸로 뒤집기
	// 1) for문 이용
	// 2) StringBuffer의 reverse()사용
	/*
	 * StringBuffer sb = new StringBuffer(str);
		StringBuffer 클래스는 String을 다루는 클래스입니다.
		생성자의 파라미터로 문자열을 입력받을 수 있습니다.
		
		String reverse = sb.reverse().toString();
		StringBuffer 클래스의 reverse() 메소드를 호출하면,
		reverse() 메소드를 호출한 객체, 즉 여기서는 sb의 문자열을 거꾸로 뒤집어서
		sb 객체의 reference를 리턴합니다.
		(reverse() 메소드는 StringBuffer 객체를 리턴하기 때문에, 
		toString() 메소드를 사용하여 String으로 변환해 주었습니다.)
		따라서, 출력 결과를 보면,
		sb 객체도 문자열이 뒤집혀 있고,
		reverse() 메소드가 리턴한 reverse의 문자열도 뒤집혀 있는 것을 확인 할 수 있습니다.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String st = sc.nextLine();
		/*
		for(int i=st.length()-1; i>=0; i--) {
			System.out.print(st.charAt(i));
		}
		*/
		StringBuffer sb = new StringBuffer(st);
		String reverse = sb.reverse().toString();
		System.out.println(reverse);
	}
	
}
