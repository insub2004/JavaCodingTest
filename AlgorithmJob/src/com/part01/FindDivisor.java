package com.part01;

import java.util.Scanner;

public class FindDivisor {

	public static void main(String[] args) {
		
		//����
		/*
		 * � �ڿ��� p�� q�� ���� ��, ���� p�� q�� �������� �� �������� 0�̸� q�� p�� ����̴�. 6�� ���� ���

			6 �� 1 = 6 �� 0
			6 �� 2 = 3 �� 0
			6 �� 3 = 2 �� 0
			6 �� 4 = 1 �� 2
			6 �� 5 = 1 �� 1
			6 �� 6 = 1 �� 0
			
			�׷��� 6�� ����� 1, 2, 3, 6, �� �� ���̴�. �� ���� �ڿ��� N�� K�� �־����� ��, N�� ����� �� K��°�� ���� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 */
		
		//�Է�
		//ù° �ٿ� N�� K�� ��ĭ�� ���̿� �ΰ� �־�����. N�� 1 �̻� 10,000 �����̴�. K�� 1 �̻� N �����̴�.
		//���
		//ù° �ٿ� N�� ����� �� K��°�� ���� ���� ����Ѵ�. 
		//���� N�� ����� ������ K������ ��� K��° ����� �������� ���� ��쿡�� 0�� ����Ͻÿ�.
		
		//�Է� ����
		//6 3
		//��� ����
		//3
		
		
		//N�� K�Է� �ޱ�
		//N�� ����� �迭�� ���ʷ� �ֱ�
		//K��°�� ���� ���� �տ� �����ߴ� �迭���� ã��(������ 0)
		
		Scanner sc = new Scanner(System.in);
		/*
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		//��� ���� 
		int cnt=0;
		
		for(int i=1; i<=N; i++) {
			if(N%i==0) {
				cnt++;
			}
		}
		int[] intarr = new int[cnt];
		
		//�迭�ε���
		int indexcnt=0;
		for(int i=1; i<=N; i++) {
			if(N%i==0) {
				//intarr[i-1] = i; --- ����� �ƴ� ��쿡 [i-1]���ʵ� �ǳʶپ i�� 6�϶� [5]�� ������ �ؼ� ����
				intarr[indexcnt] = i;
				indexcnt++;
			}
		}
		
		for(int i=0;i<intarr.length;i++) {
			System.out.println(intarr[i]);
		}
		
		if(intarr.length >= K) {				//>= �� �ؾ��� ���̿� K�� ���� ���� ��쿡�� ��°�����
			System.out.println(intarr[K-1]);	//�ε����� 0���ʹϱ�
		}else System.out.println(0);
		*/
		
		//���� K��° ���ķδ� ���ɾ���.
		//��� ����� ���� �ʿ�� ���� ���̴�.
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int cnt = 0;
		
		//flag���
		int flag = 0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				cnt++;
				
				if(cnt==k) {
					System.out.println(i);
					flag = 1;
				}
			}
		}
		if(flag==0) System.out.println(0);
		
	}
}
