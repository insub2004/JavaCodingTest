package com.doit;

import java.util.Scanner;

public class QN17 {

	public static void main(String[] args) {
		// ���� 1427�� ������������ �ڸ��� �����ϱ� (��������)
		
		Scanner sc = new Scanner(System.in);
		
		String st = sc.next();
		
		int arr[] = new int[st.length()];
		
		for(int i=0; i<st.length(); i++) {
			arr[i] = Integer.parseInt(st.substring(i, i+1));
		}
		
		//���� ����
		for(int i=0; i<st.length(); i++){
			
			int Max = i;	// �� �տ� �ִ� ���� �ִ����� ����
			
			for(int j=i+1; j<st.length(); j++) {	// �� �տ� �ִ� ���� �ٷ� ���� ���� ���� ��
				if(arr[j] > arr[Max]) {
					Max=j;							// ���ĵ��� �ʴ� ��ŭ�� ���� �߿� �ִ��� ã��
				}
			}
			
			if(arr[i] < arr[Max]) {
				int tmp = arr[i];
				arr[i] = arr[Max];
				arr[Max] = tmp;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		
	}
}
