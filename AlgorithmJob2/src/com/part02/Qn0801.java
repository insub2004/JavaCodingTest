package com.part02;

import java.util.Scanner;

public class Qn0801 {

	public static void main(String[] args) {
		
		//�� ��° �ּڰ� ã��
		//�������� �Ⱦ��� ���ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//ù ��°�� ���� �ڿ���
		int min01 = 10000000;
		int idx = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(min01>arr[i]) {
				min01 = arr[i];
				idx = i;
			}
		}
		//�� ����� ���� �ڿ���
		int min02 = 10000000;
		for(int i=0; i<arr.length; i++) {
			if(i==idx) continue;
			if(min02>arr[i]) {
				min02 = arr[i];
				idx = i;
			}
		}
		System.out.println(min02);
		System.out.println(idx+1);
	}
}
