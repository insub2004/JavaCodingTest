package com.doit;

import java.util.Scanner;

public class QN06 {

	public static void main(String[] args) {
		
		// ���� 2018�� ���ӵ� �ڿ����� �� ���ϱ�
		
		/*
		 * �ð����⵵ Q(n)�̰� ���ӵ� �ڿ����� ���̴� �� �����͸� ����غ���
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int s_index=1;	// �����ε���
		int e_index=1;	// �����ε���
		int sum = 1;	// �����ε��� + �����ε���
		int count = 1;  // N�� �ڱ��ڽŸ� �����ϴ� ��� ���
		
		int N = sc.nextInt(); // N��
		
		while(e_index != N) {				// ���� �߿���!!
			if(sum<N) {						// ���� �ű�� 
				e_index++;					// ��������� ���ӵ� s~e�ε��� ������ ���� ���� �񱳿� ��� �� �� �ִ� 
				sum = sum + e_index;
			}else if(sum>N) {
				sum = sum - s_index;		// ����
				s_index++;					// �Űܾ��� �ű� ���� ���ӵ� s~e�ε��� ������ ���� ���� �񱳿� ��� �� �� �ִ�.
			}else if(sum==N) {
				count++;
				e_index++;
				sum = sum + e_index;
			}
		}
		
		System.out.println(count);
		
	}
}
