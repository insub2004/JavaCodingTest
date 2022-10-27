package com.part03;

import java.util.Scanner;

public class GCDLCMRe {

	public static void main(String[] args) {
		
		/*
		 * 	����
			�� ���� �ڿ����� �Է¹޾� �ִ�����(GCD)�� �ּҰ����(LCM)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.  
			
			�Է�
			ù° �ٿ��� �� ���� �ڿ����� �־�����. �� ���� 10,000 ������ �ڿ����̸� ���̿� �� ĭ�� ������ �־�����.
			
			 
			
			���
			ù° �ٿ��� �Է����� �־��� �� ���� �ִ�������, ��° �ٿ��� �Է����� �־��� �� ���� �ּҰ������ ����Ѵ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//�ִ�������
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//�ּҰ������
		int A = a;
		int B = b;
		
		//��Ŭ���� ȣ������ �̿��ؼ� �ִ����� ���ϱ�
		while(true) {
			int c = a%b;
			if(c==0) break;
			a=b;
			b=c;
		}
		
		int GCD = b;
		
		int LCM = (A/b)*(B/b)*b;
		
		System.out.print(GCD+"\n"+LCM);
		
		
	}
}
