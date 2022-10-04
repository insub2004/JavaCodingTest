package com.part02;

import java.util.Scanner;

public class FindSecondMinValue {

	public static void main(String[] args) {
		
		/*
		 * 9���� ���� �ٸ� �ڿ����� �־��� ��, �̵� �� �� ��° �ּڰ��� ã��, 
		 * �� �� ��° �ּڰ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
		 * ���� ���, ���� �ٸ� 9���� �ڿ��� 3, 29, 38, 12, 57, 74, 40, 85, 61 �� �־�����, 
		 * �̵� �� �� ��° �ּڰ��� 12�̰�, �� ���� 4��° ���̴�.
		 * 
		 * �Է�
		 * ù° �ٺ��� ��ȩ ��° �ٱ��� �� �ٿ� �ϳ��� �ڿ����� �־�����. �־����� �ڿ����� 10,000,000 ���� �۴�.
		 * 
		 * ���
		 * ù° �ٿ� �� ��° �ּڰ��� ����ϰ�, ��° �ٿ� �� ��° �ּڰ��� �� ��° �������� ����Ѵ�.
		 * 
		 * ����� ����
		 *  3
			29
			38
			12
			57
			74
			40
			85
			61
			
			12
			4
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		
		for(int i=0; i<9; i++) {
			arr[i] = sc.nextInt();
		}
		
		/*
		for(int i:arr) {
			System.out.print(arr[i] + " ");
		}
		*/
		
		//���� ���� �ּڰ��� �ε���
		int min = arr[0];
		int minIndex = 0;
		
		//�켱 ���� �ּڰ��� �ּڰ��� �ε����� ã��
		for(int i=0; i<arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
				minIndex = i;
			}
		}
		
		//�ι�°�� ���� �ּڰ��� �ε���
		int minnd;
		if(minIndex==0) minnd=arr[1];
		else minnd=arr[0];
		
		int minndIndex = 0;
		
		//ã�� ���� �ּڰ��� �ε������� ������ �����ؼ� �ι�°�� ���� �ּڰ� ã��
		for(int i=0; i<arr.length; i++) {
			if(i==minIndex) continue;
			if(minnd>arr[i]) {
				minnd=arr[i];
				minndIndex = i;
			}
		}
		
		System.out.println(minnd);
		System.out.println(minndIndex+1);	//��� ���� ������ �ߺ���
		
	}
}
