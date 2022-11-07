package com.doit;

import java.util.Scanner;

public class Q1676 {

	public static void main(String[] args) {
		
		/*
		 * ���� 2004������ ���� �� ��
		 * 
		 * n!�϶� 0�� ������ 2��5�� �¼� �ּڰ��� ������ ���̴�. 
		 * 2 * 5 -> 10;
		 * 
		 * ���⼭ 2�� �Ҽ��� �� ���� ���� ������
		 * 2�� �¼��� 5�� �¼����� �׻� Ŭ ���̴�.
		 * 
		 * 5�� ������ �˾Ƶ� 0�� ������ �� �� �ִµ�
		 * 25!�� ��� 1*2*3*4*5*6*7*8*9....*24*25�� �پ��ϰ�
		 * 5 10 15 20 25 �������� 5�� ���� �� �� �� �ִ�
		 * -> 5*1 5*2 5*3 5*4 5*5 �̰� 25���� ��� 5^2�̱� ������ 6���� �ȴ�
		 * 5^n�¿� ���� ī��Ʈ ���� �Ѱ� �߰����ָ� �ȴ�.
		 * 
		 * https://st-lab.tistory.com/165 ����
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int count = 0;
		
		while(num>=5) {
			count += num/5;
			num/=5;
		}
		System.out.println(count);
		
	}
}
