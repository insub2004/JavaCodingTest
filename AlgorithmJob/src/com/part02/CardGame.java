package com.part02;

import java.util.Scanner;

public class CardGame {

	public static void main(String[] args) {
		
		/*
		 * ������ ������ �� ����, �� ���帶�� A�� B�� ������ ī���� ���ڿ� �� ������ ���ڸ� �����ش�. (��� ����� D�� ǥ����)
		 * 
		 * �Է�
		 * ���� ������ ǥ�� �Է����� �־�����. ù ��° �� ���� A�� ������ ī���� ���� 10���� ���� ������� �־�����, 
		 * �� ��° �ٿ��� B�� ������ ī ���� ���� 10���� ���� ������� �־�����.
		 * 
		 * ���
		 * ���� ������ ǥ�� ������� ����Ѵ�. ������ �� �а� �����Ǵ� ��� �¸��� ����� ����ϰ�, ���� ��쿡�� D�� ����Ѵ�.
		 * 
		 * ����� ����
		 * 6 7 5 1 4 10 2 3 8 9 
		 * 1 10 2 9 4 8 3 7 5 6
		 * 
		 * A
		 */
		
		
		
		Scanner sc = new Scanner(System.in);
		
		//�� �迭�� Ǯ���
		int arr[] = new int[20];
		
		for(int i=0; i< arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//�̱涧 ��涧 ����
		int a=0, b=0, d=0;
		
		
		//������ arr.length�� ������ i�� 10�Ǵ� ���� [20]���� ���� �ε��� ����
		for(int i=0;i<10;i++) {
			if(arr[i] > arr[i+10]) {
				a++;
			}else if(arr[i]<arr[i+10]){
				b++;
			}else if(arr[i]==arr[i+10]) {
				d++;
			}
		}
		
		if(a>b) {
			System.out.println("A");
		}else if(a==b) {
			System.out.println("D");
		}else {
			System.out.println("B");
		}
		
	}
}
