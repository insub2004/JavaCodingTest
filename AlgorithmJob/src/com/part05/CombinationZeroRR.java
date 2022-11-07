package com.part05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CombinationZeroRR {

	/*
	 * 백준 1676문제랑 같이보자
	 * 
	 * 문제
		n명의 사람중 m명을 순서에 상관없이 뽑는 경우의 수를 조합이라고 하며 nCm으로 나타낸다.
		nCm은 수식으로 n!/m!(n-m)! 으로 구할 수 있다. (5! = 1 * 2 * 3 * 4 * 5)
		n과 m이 주어졌을때 nCm의 끝자리 0의 개수를 출력하는 프로그램을 작성하시오.  
		
		입력
		첫째 줄에 정수 n, m(0≤m≤n≤1,000,000)이 들어온다.
		
		출력
		첫째 줄에 0의 개수를 출력한다.
		
		0의 갯수는 즉 2와5의 승수 중 최솟값을 알아보면된다. 2*5->10
		
		그리고
		2의 배수일 때 5의 배수일 때 각각 1씩 더해줘야 하는 것 잊지말자
		
		n!=2^a1,5^a2 | n-m!=2^b1,5^b2 | m!=2^c1,5^c2
		
			n!				2^a1 X 5^a2
		(n-m)!m! =>	(2^b1 X 5^b2)X(2^c1 X 5^c2)	=> 2^(a1-b1-c1)X5^(a2-b2-c2)
						
	 */
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long N = Integer.parseInt(st.nextToken());
		long M = Integer.parseInt(st.nextToken());
		
		long count5 = five_power(N) - five_power(N-M) - five_power(M);
		long count2 = two_power(N) - two_power(N-M) - two_power(M);
		
		System.out.println(Math.min(count5, count2));
		
	}
	
	public static long five_power(long num) {
		
		int count = 0;
		
		while(num>=5) {
			count += num/5;
			num/=5;
		}
		
		return count;
	}

	public static long two_power(long num) {
		
		int count = 0;
		
		while(num>=2) {
			count += num/2;
			num/=2;
		}
		
		return count;
	}
}
