package com.part02;

import java.util.Scanner;

public class Qn19 {
	
	//offset
	public static void main(String[] args) {
		
		//5*5 ��������� 7*7�� ���� ���� �ٱ��� 0���� ����� �� �� �����¿츦 ��������
		//������� 1~5�� �Է� ������ �������� 0
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[7][7];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j]=10;
			}
		}
		
		for(int i=1; i<6; i++) {
			for(int j=1; j<6; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=1; i<6; i++) {
			for(int j=1; j<6; j++) {
				if(arr[i][j] < arr[i-1][j] && 
				   arr[i][j] < arr[i+1][j] &&
				   arr[i][j] < arr[i][j-1] &&
				   arr[i][j] < arr[i][j+1]) {
					System.out.print("* ");
				}
				else System.err.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
