package com.part03;

import java.util.Scanner;

public class ModeMean {

	// �ֺ�, ��� ���ϱ�
	
	/*
	 *	�Է�
		ù° �ٺ��� �� ��° �ٱ��� �� �ٿ� �ϳ��� �ڿ����� �־�����. �־����� �ڿ����� 1,000 ������ 10 �� ����̴�.

 

		���	
		ù° �ٿ��� ����� ����ϰ�, ��° �ٿ��� �ֺ��� ����Ѵ�. �ֺ��� �� �̻��� ��� �� �� �ּҰ��� ����Ѵ�. ��հ� �ֺ��� ��� �ڿ����̴�.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];	//�Է¹��� ������ �迭
		
		int sum = 0;					
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		
		int avg = sum/10;		//��հ�
		
		int maxV = 0;	// �ֺ� ���� ����
		int maxC = -1;  // �ֺ��� �󵵼��� ���� ����
		int cnt = 0;	// �󵵼��� �� ����
		
		for(int i=0; i<arr.length; i++) {
			if(maxV == arr[i]) continue;		// ���� �ֺ��� �� ���Ϸ��� �ϸ� �׳� ���� ������ �Ѿ��
			
			for(int j=0; j<arr.length; j++) {
				if(arr[i]==arr[j]) cnt++;
			}
			
			if(cnt > maxC) {
				maxC = cnt;
				maxV = arr[i];
			}else if(cnt == maxC && maxV > arr[i]) {
				maxV = arr[i];
			}
			
			cnt = 0;		// ������� �߿伺!!!!!
		}
		
		System.out.println(avg);
		System.out.println(maxV);
	}
	
}
