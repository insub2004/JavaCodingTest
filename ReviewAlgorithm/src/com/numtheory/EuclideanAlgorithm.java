package com.numtheory;

public class EuclideanAlgorithm {

	public static void main(String[] args) {
		
		int a = 152;
		int b = 68;
		
		int A = a;
		int B = b;
		
		int gcd = gcd(a,b);
		System.out.printf("%d�� %d�� �ִ������� %d�Դϴ�.\n", a,b,gcd);
		
		int lcm = lcm(gcd, A, B);
		System.out.printf("%d�� %d�� �ִ������� %d�Դϴ�.\n", A,B,lcm);
		
	}

	private static int lcm(int GCD, int A, int B) {
		
		int ans = GCD*(A/GCD)*(B/GCD);
		
		return ans;
	}

	private static int gcd(int a, int b) {
		
		int r = 0; // a�� b�� ���� ������
		
		while(b != 0) {
			r = a%b;
			if(r==0) break;
			a = b;
			b = r;
		}
		
		return b;
	}
}
