package com.part01;

import java.util.Scanner;

public class CountMultiple {

	public static void main(String[] args) {
		
		//����
		/*
		 * �� ���� �ڿ��� A, B, C�� �־�����. �� ��, A���� B���� ���� �߿��� C�� ����� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

		���� ���, A = 3, B = 9, C = 2 ��� ����. �׷��� 3���� 9���� ���� �� 2�� ����� �����̹Ƿ� 4, 6, 8 �� 3���� �����Ѵ�. ���� 3�� ����Ѵ�.

		����, A = 10, B = 3, C = 4��� ����. �׷��� 10���� 3���� ���� �� 4�� ����� �����̹Ƿ� 4, 8 �� 2���� �����Ѵ�. ���� 2�� ����Ѵ�.
		 */
		
		//�Է� ����
		//3 9 2
		//��� ����
		//3
		//�Է� ����
		//10 3 4
		//��� ����
		//2
		
		Scanner sc = new Scanner(System.in);
		
		// �Է� ���� 3�� �ޱ�
		int A, B, C;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		// cnt����
		int cnt=0;
		
		// A,B �ּڰ� �ִ� �Ǻ�
		int min;
		int max;
		
		if(A>=B) {min=B;max=A;}
		else {min=A;max=B;}
		
		// cnt�ϳ��� ������Ű�� A B ������ C�� ��� ���ϱ�
		for(int i=1;i*C<=max;i++) {
			if(i*C>=min && i*C<=max) {
				cnt+=1;
			}
		}
		System.out.println(cnt);
	}
}
