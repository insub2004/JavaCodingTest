package com.part05;

import java.util.Scanner;

public class LCM {

	/*
	 * ����
		���� B�� 0���� ū ������ N���� ���� ���� A�� ���� �� �ִٸ� A�� B�� ����̴�.

		10�� 20�� �ּҰ������ 20�̴�.
		5�� 3�� �ּҰ������ 15�̴�.
		����� �� ���� ���Ͽ� �ּҰ������ ���ϴ� ���α׷��� �ۼ� �ϴ� ���� ��ǥ�̴�.  
		
		�Է�
		�� �ٿ� �� �ڿ��� A�� B�� �������� �и��Ǿ� �־�����.
		
		A�� B�� 100,000,000(10^8)���� �۴�.
		
		����: ū �� �Է¿� ���Ͽ� ������ 64��Ʈ ������ �����Ͻÿ�. C/C++������ long long int(%lld)�� ����ϰ�, Java������ long�� ����Ͻÿ�.

		���
		A�� B�� �ּҰ������ �� �ٿ� ����Ѵ�.
		
		==> ��Ŭ���� ȣ�������� Ǯ��
		 LCM = GCD*(A/GCD)*(B/GCD)
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		long r = 0;
		
		long A = a;		// LCM ���� �� �� ���纻
		long B = b;
		
		
		long GCD = 0;
		long LCM = 0;
		// �켱 GCD���ϱ�
		while(true) {
			r = a%b;
			if(r==0) {
				GCD = b;
				break;
			}
			a = b;
			b = r;
		}
		
		// LCM���ϱ�
		LCM = (A/GCD)*(B/GCD)*GCD;
		System.out.println(LCM);
		
	}
	
}
