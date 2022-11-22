package com.partq20;

import java.util.Scanner;

public class PrimeRe {

	public static long i;
	public static long j;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		boolean is_prime[] = new boolean[1000010];
		
		for(int i=1; i<=n; i++) {
			is_prime[i] = true;
		}
		is_prime[1] = false;
		
		for( i=1; i<=n; i++) {
			if(!is_prime[(int) i]) continue;	// 지워졌으면 넘어가
			
			for( j=i*i; j<=n; j+=i) {
				is_prime[(int) j] = false;
			}
		}
		
		for(int i=1; i<=n; i++) {
			if(is_prime[i]) {
				System.out.print(i+" ");
			}
		}
	}
}
