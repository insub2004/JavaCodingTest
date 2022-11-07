package com.part05;

import java.util.Scanner;

public class FindPrime {

	/*
	 * ����
		�־��� ���ڵ� �� �Ҽ��� �� ������ ã�Ƽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.  
		
		�Է�
		ù �ٿ� ���� ���� N�� �־�����. N�� 100�����̴�. �������� N���� �ٿ� ���� N���� ���� �־����µ� ���� 1,000 ������ �ڿ����̴�.
		
		 
		
		���
		�־��� ���� �� �Ҽ��� ������ ����Ѵ�.
	 * 
	 */
	static int result = 0;
	
	public static int prime(int a) {
		
		result = 0;				// �ʱ�ȭ ��������!!!!!!!
		
		for(int i=2; i<a; i++) {
			if(a%i == 0) {
				result = 1;		// �Ҽ��� �ƴϸ� 1
				break;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int cnt = 0;
		
		for(int i=0; i<n; i++) {
			if(arr[i]<=1) continue;
			prime(arr[i]);
			if(result == 0) cnt++;
		}
		
		System.out.println(cnt);
		
		
	}
}
