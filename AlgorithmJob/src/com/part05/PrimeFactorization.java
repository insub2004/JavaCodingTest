package com.part05;

import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {
		
		//���μ� ����
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// �Ҽ� 2 3 5 7 11 13.... �Ҽ��� ����Ʈ�� ���� �� ���� �ȴ�.
		// �׳� ���� 2���� �� ������ ����. -> ���� 4���� ���ٰ� �ص� �̹� 2�� �� �� ������ŭ �߱� ������ ���� 4�� ������ ������ ���� ����.
		
		/*	// �� Ǯ��
		int namugi = n;					// �Ҽ� �������� �� �� �������� �� ���� ���� ��� ����ϱ� ���� ������ ����
		for(int i=2;i<=namugi;i++) {	// 2~�������� �� ���� ����� ��� �Ҽ��� ���������� �Ǻ��ؾ� ������ 
			if(namugi%i == 0) {
				System.out.printf("%d ", i);
				namugi = namugi/i;		// �� �ֱ�
				i = 1;					// �Ҽ� �Ǻ��� �� 2���� ���������ϴµ� for���� �����κ� ������ i=1�� �ؾ� 2���� �ٽ� ������.
			}
		}
		*/
		
		// ����� Ǯ��
		// for ������ �������� ����, �����غ� ��
		
		for(int i=2; n>1;) {
			if(n%i==0) {
				System.out.printf("%d ", i);
				n/=i;
			}
			else i++;
		}
		
	}
}
