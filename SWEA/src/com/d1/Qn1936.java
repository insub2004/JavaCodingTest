package com.d1;

import java.util.Scanner;

public class Qn1936 {

	// ����������
	// ������ 1, ������ 2, ���� 3���� ǥ���Ǹ� A�� B�� ������ �´��� �Է����� �־�����.
	// A�� B�߿� ���� �̰���� �Ǻ��غ���. ��, ���� ���� ����.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		// 1:���� 2:���� 3:�� , ���� ��� ����
		switch (A) {
		case 1:
			if(B==2) System.out.println('B');
			else if(B==3) System.out.println('A');
			break;
		case 2:
			if(B==1) System.out.println('A');
			else if(B==3) System.out.println('B');
			break;
		case 3:
			if(B==1) System.out.println('B');
			else if(B==2) System.out.println('A');
			break;
		}
		
	}
}
