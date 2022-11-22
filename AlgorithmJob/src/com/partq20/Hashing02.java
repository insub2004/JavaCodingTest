package com.partq20;

import java.util.Scanner;

public class Hashing02 {

	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		

		for(int test_case = 1; test_case <= T; test_case++)
		{
		
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int []arrN = new int[N];
			int []arrM = new int[M];
			int ansLen = 0;
			if(N==M) ansLen = 1;	//N과 M의 길이가 같을 때
			else ansLen = N-M+1;		//N과 M의 길이가 다를 때
			
			
			for(int i=0; i<N; i++) {
				arrN[i] = sc.nextInt();
			}
			for(int i=0; i<M; i++) {
				arrM[i] = sc.nextInt();
			}
			
			long max = -100000000;
			for(int i=0; i<ansLen; i++) {		// ans[]에 N수열과 M수열의 합을 넣기
				long val = 0;
				for(int j=0; j<arrM.length; j++) {
					val+=(long)arrN[i+j]*arrM[j];
				}
				if(max < val) max = val;
			}
			
			System.out.printf("#%d %d\n",test_case, max);
		}
	}
}
