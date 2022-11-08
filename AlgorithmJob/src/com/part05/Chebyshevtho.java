package com.part05;

import java.util.Scanner;

public class Chebyshevtho {

	// 백준 4948
	/*
	 * 아리스토테네스의 체를 이용해서 풀자
	 * 
	 * 입력범위 n<123,456	=> 2n부분 때문에 그냥 1000000으로 해주자
	 * 
	 */
	
	public static int MAX = 1000000;
	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		boolean arr[] = new boolean[MAX+1];
		
		// 전체에 true 값 넣어주기
		for(int i=2; i<=MAX; i++) {
			arr[i] = true;
		}
		
		// 소수가 아닌 것들 지우기
		for(int i=2; i<=MAX; i++) {				//2부터 끝까지
			if(arr[i]==false) continue;			//만약 false로 바뀌어있으면 넘어가 -> 이미 i의 배수로서 지워졌으면 넘어가
			for(int j=i*2; j<=MAX; j += i) {	//지워지지 않은 i이면 i본인을 제외하고 i배수들은 지우기
				arr[j] = false;
			}
		}
		
		while(true) {
			
			int n = sc.nextInt();
			
			if(n==0) break;
			
			int cnt = 0;
			
			for(int i=n+1; i<=2*n; i++) {
				if(arr[i]) cnt++;
			}
			
			System.out.println(cnt);
			
		}
		
	}
	
}
