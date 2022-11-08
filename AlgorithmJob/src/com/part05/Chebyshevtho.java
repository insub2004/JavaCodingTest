package com.part05;

import java.util.Scanner;

public class Chebyshevtho {

	// ���� 4948
	/*
	 * �Ƹ������׳׽��� ü�� �̿��ؼ� Ǯ��
	 * 
	 * �Է¹��� n<123,456	=> 2n�κ� ������ �׳� 1000000���� ������
	 * 
	 */
	
	public static int MAX = 1000000;
	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		boolean arr[] = new boolean[MAX+1];
		
		// ��ü�� true �� �־��ֱ�
		for(int i=2; i<=MAX; i++) {
			arr[i] = true;
		}
		
		// �Ҽ��� �ƴ� �͵� �����
		for(int i=2; i<=MAX; i++) {				//2���� ������
			if(arr[i]==false) continue;			//���� false�� �ٲ�������� �Ѿ -> �̹� i�� ����μ� ���������� �Ѿ
			for(int j=i*2; j<=MAX; j += i) {	//�������� ���� i�̸� i������ �����ϰ� i������� �����
				arr[j] = false;
			}
		}
		
		while(true) {
			
			int n = sc.nextInt();
			
			if(n==0) break;
			
			int cnt = 0;
			
			for(int i=n+1; i<=2*n; i++) {
				if(arr[i]) cnt++;
			}
			
			System.out.println(cnt);
			
		}
		
	}
	
}
