package com.part05;

import java.util.Scanner;

public class Pfactorization {

	/*
	 * ���� 11653
	 * 
	 * N�� �׳� 2���� ���μ� ���� �����ؼ�
	 * ��½�Ű�� �������� ��
	 * 
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
	
		
		
		for(int i=2; ; ) {
			if(num%i==0) {
				System.out.println(i);		// 2���� �Ҽ��� �������� i���
				num = num/i;				// num�� num/i�� �־��༭ ��� ���μ����� �̾�����
				//i=2;						// 2������ �μ��� ������� �ٽ� 2���� �����ֱ� ���ؼ�	(�ٵ� �̰� �����ص� ���� ��, 2�� �� �� ���߱� ������) 
				continue;
			}
			else if(num==1) break;		
			i++;
		}
		
	}
	
}
