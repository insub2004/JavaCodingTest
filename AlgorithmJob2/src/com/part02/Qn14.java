package com.part02;

import java.util.Scanner;

public class Qn14 {

	//���� �Ƕ�̵�
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int s = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			//¦����°�� ��� 
			if(i%2==0) {	
				for(int k=1; k<=2*i-1; k++) {
					System.out.print(s);
					s++;
					if(s==10) s=1;
				}
			}
			//Ȧ����°�� ���
			else {
				//�迭 ����
				int[] arr = new int[2*i-1];
				for(int h=0; h<arr.length; h++) {
					arr[h] = s;
					s++;
					if(s==10) s=1;
				}
				//�迭 �ڿ��� ���� ��� ��Ű��
				for(int z=arr.length-1; z>=0; z--) {
					System.out.print(arr[z]);
				}
			}
			System.out.println();
		}
	}
}
