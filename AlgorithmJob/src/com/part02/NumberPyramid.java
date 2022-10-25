package com.part02;

import java.util.Scanner;

public class NumberPyramid {

	public static void main(String[] args) {

		/*
		 * N�� ���� ���� S�� �־����� ���� �Ƕ�̵带 ����� ���α׷��� �ۼ��Ͻÿ�. ���� ���, N�� 5�̰� S�� 3 �̶��, �� ���� �Ƕ�̵��
		 * ������ ����.
		 * 
		 *     3 
		 *    456 
		 *   21987 
		 *  3456789 
		 * 987654321
		 * 
		 * ���� ���� S�� �������� 1�� �����Ѵ�. ���� ���� ��ȣ�� 1���̶�� ������, ¦����° ���� ���ʿ��� ���������� 1�� �����ϵ��� ����,
		 * Ȧ����° ���� �Ųٷ� ���´�. ���ڰ� ���� 10�� �� ���, 1�� �ٲٰ� �ٽ� �����Ѵ�.
		 * 
		 * �Է� �Է��� ù ��° �ٿ� N�� ���� ���� S�� �־�����. ( 1��N��100, 1 ��S�� 9)
		 * 
		 * ��� ù ��° �ٺ��� ���� �Ƕ�̵带 ����Ѵ�. (�� �ٿ� �����ϴ� ������ ������ ������ ������ ��Ȯ�ϰ� Ȯ�����ֽùٶ��ϴ�.)
		 * 
		 * ����� ����
		 * 
		 * 5 3 
		 * 
		 *     3 
		 *    456 
		 *   21987
		 *  3456789 
		 * 987654321
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		// �� ���� ����
		int n = sc.nextInt();

		// ���� ����
		int s = sc.nextInt();

		// ¦������ �� ���� ����
		int even = 0;
		
		// Ȧ������ �� ���� ����
		int odd = s;

		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			if (i == 1) {
				System.out.print(odd);
				even = odd+1;
			} else if (i % 2 == 0) { // ¦������ �� �ι�° �� ���ۼ��ڰ� ������ Ȧ������ ù��° ����+1
				for (int j = 1; j < i * 2; j++) {
					System.out.print(even);
					even++;
					if (even == 10) {
						even = 1;
					}
				}
			} else { // Ȧ������ �� ����° �� ���ۼ��ڰ� ������ s-1�� �����ϰ� 1�� ����
				even=even-1;
				for (int j = 1; j < i * 2; j++) {
					even++;
					if(even==10) {
						even=1;
					}
				}
				odd=even;
				for (int j=1;j<i*2;j++) {
					if(j==1) {
						even = odd+1;
					}
					System.out.print(odd);
					odd--;
					if(odd==0) {
						odd=9;
					}
				}
			}
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
