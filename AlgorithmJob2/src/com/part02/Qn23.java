package com.part02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Qn23 {

	//��ǩ��
	//���, �ֺ�(�� �̻��� ��� �ּҰ��� ���)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[1001];
		
		int avg = 0;
		int sum = 0;
		int many = 10;
		
		for(int i=0; i<10; i++) {
			int val = sc.nextInt();
			sum+=val;
			arr[val]++;
		}
		
		avg = sum/10;
		
		for(int i=10; i<arr.length; i+=10) {	//10�� ����ϱ�
			if(arr[i]>arr[many]) {
				many=i;
			}
		}
		
		System.out.println(avg+"\n"+many);
		
	}
}