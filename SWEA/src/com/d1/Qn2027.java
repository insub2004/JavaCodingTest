package com.d1;

public class Qn2027 {
	
	// 대각선 출력하기
	/*
	 *  #++++
		+#+++
		++#++
		+++#+
		++++#
		
		2차배열(반복문) 써보라는 뜻인듯 
	 */

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i==j) System.out.print('#');
				else System.out.print('+');
			}
			System.out.println();
		}
	}
	
}
