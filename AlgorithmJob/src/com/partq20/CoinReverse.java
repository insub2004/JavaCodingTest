package com.partq20;

import java.util.Scanner;

public class CoinReverse {

	//17�� �ҿ�
	//Arrays.fill(arr, -1);�� �迭���� �ٸ��ɷ� ä�� �� �ֳ�
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			
			String st = sc.next();		// �迭�� ���̸� �˾ƾ��ϴϱ� ���ڿ��� ���� ����
			
			int arr[] = new int[st.length()];	// �Է¹��� ��ŭ �迭 ����
												// �迭�� �׳� ũ�� ����� 
			for(int i=0; i<st.length(); i++) {
				arr[i] = Character.getNumericValue(st.charAt(i));
			}									// int�� arr[]�迭�� �� ä���ֱ�
			
			int cnt = 0;					
			int val = 0;						// ó���� �޸� 0���� �����̴ϱ�
				
			for(int i=0; i<arr.length; i++) {
				if(arr[i] != val) {				// �ٸ��� ������ �������ִ°� �ݺ�
					val = arr[i];				// �񱳺����� ���簪���� �ٲ��ְ�
					cnt++;						// ī��Ʈ �ϳ� �÷��ֱ�
				}
			}
			
			System.out.printf("#%d %d\n", t,cnt);
			
		}
		
	}
}
