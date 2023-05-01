package com.part02;

import java.util.Scanner;

public class Qn11 {

	//주사위 게임
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] arr = new int[n][3];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int maxNum = 0;
		int now = 0;	// 현재 상금
		int max = 0;	// 제일 높은 상금
		
		for(int i=0; i<n; i++) {
			int cnt = 1;
			int val = arr[i][0];
			for(int j=1; j<2; j++) {
				if(val == arr[i][j]){
					if(val == arr[i][j+1]) cnt = 3;
					else cnt = 2;
				}
				else {
					if(arr[i][j]==arr[i][j+1]) cnt = 2;
					else {
						maxNum=val;
						if(maxNum<arr[i][j]) {
							if(arr[i][j]<arr[i][j+1]) maxNum = arr[i][j+1];
							else maxNum = arr[i][j];
						}
					}
				}
				switch (cnt) {
				case 1:
					now = maxNum*100;
					break;
				case 2:
					now = 1000+(val)*100;
					break;
				case 3:
					now = 10000+(val)*1000;
					break;
				}
			}
			
			if(max<now) max = now;
		}
		
		System.out.println(max);
		
		
		
	}
}
