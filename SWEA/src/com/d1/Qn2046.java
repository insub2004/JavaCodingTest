package com.d1;

import java.util.Scanner;

public class Qn2046 {

	//주어진 숫자만큼 # 을 출력해보세요.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.print('#');
		}
		
	}
}
