package com.part02;

import java.util.Scanner;

public class DiceGame {
	public static void main(String[] args) {
	
		/*
		 * 1�������� 6������ ���� ���� 3���� �ֻ����� ������ ������ ���� ��Ģ�� ���� ����� �޴� ������ �ִ�.

			��Ģ(1) ���� ���� 3���� ������ 10,000��+(���� ��)*1,000���� ����� �ް� �ȴ�.
				
			��Ģ(2) ���� ���� 2���� ������ ��쿡�� 1,000��+(���� ��)*100���� ����� �ް� �ȴ�.
				
			��Ģ(3) ��� �ٸ� ���� ������ ��쿡�� (�� �� ���� ū ��)*100���� ����� �ް� �ȴ�.
				
			���� ���, 3���� �� 3, 3, 6�� �־����� ����� 1,000+3 * 100���� ���Ǿ� 1,300���� �ް� �ȴ�.
			�� 3���� ���� 2, 2, 2�� �־����� 10,000+2 * 1,000 ���� ���Ǿ� 12,000���� �ް� �ȴ�. 
			3���� ���� 6, 2, 5�� �־����� �� �� ���� ū ���� 6�̹Ƿ� 6 * 100���� ���Ǿ� 600���� ������� �ް� �ȴ�.
				
			N(2��N��1,000) ���� �ֻ��� ���ӿ� �����Ͽ��� ��, ���� ���� ����� ���� ����� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
			
			����� ����
			3
			3 3 6
			2 2 2
			6 2 5
			
			12000 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//������ ��
		int num = sc.nextInt();
		
		
		//������ ���ڴ�� ������ �迭 ����
		int valueArr[] = new int[num];
		
		//2���迭
		int arr[][] = new int[num][3];
		
		//2���迭�� �� �Է¹ޱ�
		for(int i=0;i<num;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<1;j++) {
				if(arr[i][j]==arr[i][j+1]&&arr[i][j+1]==arr[i][j+2]) {										//��Ģ1
					valueArr[i] = 10000 + arr[i][j]*1000;
				}else if(arr[i][j]!=arr[i][j+1]&&arr[i][j]!=arr[i][j+2]&&arr[i][j+1]!=arr[i][j+2]) {		//��Ģ3
					if(arr[i][j] > arr[i][j+1] && arr[i][j] > arr[i][j+2]) {								//��Ģ3 - [][0]���� ���� Ŭ �� 
						valueArr[i] = arr[i][j]*100; 
					}else if(arr[i][j+1]>arr[i][j] && arr[i][j+1]>arr[i][j+2]) {							//��Ģ3 - [][1]���� ���� Ŭ ��
						valueArr[i] = arr[i][j+1]*100;
					}else{																					//��Ģ3 -	 [][2]���� ���� Ŭ ��
						valueArr[i] = arr[i][j+2]*100;
					}
				}else {																						//��Ģ2
					if(arr[i][j]==arr[i][j+1] || arr[i][j]==arr[i][j+2]) {									//��Ģ2 - [0][0]==[0][1] or [0][0]==[0][2]
						valueArr[i] = 1000+arr[i][j]*100;
					}else valueArr[i] = 1000+arr[i][j+1]*100;												//��Ģ2 - [0][1]==[0][2]
				}
			}
		}
		
		//for(int i=0; i<num; i++) {
		//	System.out.println(valueArr[i]);
		//}

		//�ִ�
		int maxValue = valueArr[0];
		
		for(int i=1; i<num; i++) {
			if(maxValue < valueArr[i]) {
				maxValue = valueArr[i];
			}
		}
		System.out.println(maxValue);
	}
}
