package com.doit;

import java.util.Scanner;

public class QN06 {

	public static void main(String[] args) {
		
		// 백준 2018번 연속된 자연수의 합 구하기
		
		/*
		 * 시간복잡도 Q(n)이고 연속된 자연수의 합이니 투 포인터를 사용해보자
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int s_index=1;	// 시작인덱스
		int e_index=1;	// 종료인덱스
		int sum = 1;	// 시작인덱스 + 종료인덱스
		int count = 1;  // N의 자기자신만 포함하는 경우 고려
		
		int N = sc.nextInt(); // N값
		
		while(e_index != N) {				// 순서 중요함!!
			if(sum<N) {						// 먼저 옮기고 
				e_index++;					// 더해줘야지 연속된 s~e인덱스 값들의 합을 다음 비교에 사용 할 수 있다 
				sum = sum + e_index;
			}else if(sum>N) {
				sum = sum - s_index;		// 빼고
				s_index++;					// 옮겨야지 옮긴 후의 연속된 s~e인덱스 값들의 합을 다음 비교에 사용 할 수 있다.
			}else if(sum==N) {
				count++;
				e_index++;
				sum = sum + e_index;
			}
		}
		
		System.out.println(count);
		
	}
}
