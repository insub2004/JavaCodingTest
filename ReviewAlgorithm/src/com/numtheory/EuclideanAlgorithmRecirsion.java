package com.numtheory;

public class EuclideanAlgorithmRecirsion {
	public static void main(String[] args) {
		
		int a = 152;
		int b = 68;
		
		int A = a;
		int B = b;
		
		int gcd = gcd(a,b);
		System.out.printf("%d와 %d의 최대공약수는 %d입니다.\n", a,b,gcd);
		
		int lcm = lcm(A, B);
		System.out.printf("%d와 %d의 최대공약수는 %d입니다.\n", A,B,lcm);
		
	}

	private static int lcm(int a, int b) {
		// 최소공배수를 구하는 공식
		// L=A*B/G
		
		return a*b/gcd(a,b);
	}

	private static int gcd(int a, int b) {
		// a와 b의 최대공약수를 구하는 메서드
		
		if(a%b==0) {	//기저조건
			return b;
		}
		return gcd(b,a%b);
	}
}
