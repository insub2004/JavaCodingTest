package com.part02;

import java.util.Scanner;

public class Qn27 {

	//class president
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] arr = new int[1005][5];
		int cnt = 0;
		int max = -1;
		int cntIdx = 0;
		
		//�Է� �ޱ�
		for(int i=1;i<=n;i++) {
			for(int j=0; j<5; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=1; i<=n; i++){
			//i��° �л��� ���ؼ�
			for(int j=1; j<=n; j++) {
				//i�� j�л��� ���� ���� ���� �ִ°�
				if(i==j)continue;
				if(arr[i][0]==arr[j][0] ||
				   arr[i][1]==arr[j][1] ||
				   arr[i][2]==arr[j][2] ||
				   arr[i][3]==arr[j][3] ||
				   arr[i][4]==arr[j][4]) cnt++;
			}
			if(max<cnt) {
				max = cnt;
				cntIdx = i;
			}
			cnt=0;
		}
		
		System.out.println(cntIdx);
	}
}
