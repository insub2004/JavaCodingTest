package com.partFinal;

import java.util.Scanner;

public class Qc02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	//�л���
		
		int m = sc.nextInt();	//��Ƚ��
		
		int edge[][] = new int[m][2];
		
		//���� �Է¹ޱ�
		for(int i=0; i<m; i++) {
			edge[i][0] = sc.nextInt();
			edge[i][1] = sc.nextInt();
		}
		
		//B�� ���� Ƚ�� �迭 ������ֱ�
		int arr[] = new int[n+1];		
		arr[0] = -1;					//0����
		for(int i=0; i<m;i++) {
			arr[edge[i][1]]+=1;
		}
		
		//Ƚ�� �迭�� ���鼭 '0';�̸� ����ϰ� ��µǸ� -1�־��ְ�
		//����ϴ� ���� ���õ� ������ Ƚ�� �迭���� --���ֱ�	--> 0���� Ž���ϴϱ� ���� ���� ���� ����
		int val=0;
		for(int i=1; i<=n; i++) {				//n��ŭ ���
			for(int j=1; j<arr.length; j++) {	//Ƚ�� �迭���� 0�� Ž��
				if(arr[j]==0) {
					System.out.print(j+" ");	//j���
					val = j;					//j���� edge���� ����ؾ��� 
					arr[j] = -1;				//����� ���� -1��
					break;
				}
			}
			for(int k=0; k<m; k++) {
				if(val==edge[k][0]) {			//edge�� 1���� ���� ���� ������ 
					arr[edge[k][1]]--;			//Ƚ���迭���� -- ���ֱ�
				}
			}
		}
		
	}
	
}
