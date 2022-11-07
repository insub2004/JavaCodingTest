package com.doit;

import java.util.Scanner;

public class Q1676 {

	public static void main(String[] args) {
		
		/*
		 * 백준 2004문제랑 같이 볼 것
		 * 
		 * n!일때 0의 갯수는 2와5의 승수 최솟값의 조합일 것이다. 
		 * 2 * 5 -> 10;
		 * 
		 * 여기서 2는 소수들 중 가장 작은 수여서
		 * 2의 승수가 5의 승수보다 항상 클 것이다.
		 * 
		 * 5의 갯수만 알아도 0의 갯수를 알 수 있는데
		 * 25!의 경우 1*2*3*4*5*6*7*8*9....*24*25를 다안하고
		 * 5 10 15 20 25 정도에만 5가 들어가는 걸 알 수 있다
		 * -> 5*1 5*2 5*3 5*4 5*5 이고 25같은 경우 5^2이기 때문에 6개가 된다
		 * 5^n승에 따라 카운트 값을 한개 추가해주면 된다.
		 * 
		 * https://st-lab.tistory.com/165 참고
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int count = 0;
		
		while(num>=5) {
			count += num/5;
			num/=5;
		}
		System.out.println(count);
		
	}
}
