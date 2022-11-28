package com.numtheory;

public class EuclideanAlgorithm {

	public static void main(String[] args) {
		
		int a = 152;
		int b = 68;
		
		int A = a;
		int B = b;
		
		int gcd = gcd(a,b);
		System.out.printf("%d와 %d의 최대공약수는 %d입니다.\n", a,b,gcd);
		
		int lcm = lcm(gcd, A, B);
		System.out.printf("%d와 %d의 최대공약수는 %d입니다.\n", A,B,lcm);
		
	}

	private static int lcm(int GCD, int A, int B) {
		
		int ans = GCD*(A/GCD)*(B/GCD);
		
		return ans;
	}

	private static int gcd(int a, int b) {
		
		int r = 0; // a를 b로 나눈 나머지
		
		while(b != 0) {
			r = a%b;
			if(r==0) break;
			a = b;
			b = r;
		}
		
		return b;
	}
}
