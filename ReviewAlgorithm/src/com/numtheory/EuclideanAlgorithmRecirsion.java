package com.numtheory;

public class EuclideanAlgorithmRecirsion {
	public static void main(String[] args) {
		
		int a = 152;
		int b = 68;
		
		int A = a;
		int B = b;
		
		int gcd = gcd(a,b);
		System.out.printf("%d�� %d�� �ִ������� %d�Դϴ�.\n", a,b,gcd);
		
		int lcm = lcm(A, B);
		System.out.printf("%d�� %d�� �ִ������� %d�Դϴ�.\n", A,B,lcm);
		
	}

	private static int lcm(int a, int b) {
		// �ּҰ������ ���ϴ� ����
		// L=A*B/G
		
		return a*b/gcd(a,b);
	}

	private static int gcd(int a, int b) {
		// a�� b�� �ִ������� ���ϴ� �޼���
		
		if(a%b==0) {	//��������
			return b;
		}
		return gcd(b,a%b);
	}
}
