package com.part02;

import java.util.Scanner;

public class Qn1101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] arr = new int[n][3];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int now = 0;
		int max = 0;
		int val = 0;
		
		for(int i=0; i<n; i++) {
			
			if(arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2]) {
				now = 10000+arr[i][0]*1000;
			}
			else if(arr[i][0] == arr[i][1] && arr[i][1] != arr[i][2]) {
				now = 1000+arr[i][0]*100;
			}
			else if(arr[i][0] != arr[i][1] && arr[i][1] == arr[i][2]) {
				now = 1000+arr[i][1]*100;
			}
			else if(arr[i][0] == arr[i][2] && arr[i][0] != arr[i][1]) {
				now = 1000+arr[i][0]*100;
			}
			else {
				val = arr[i][0];
				if(val < arr[i][1] && arr[i][1]<arr[i][2]) val = arr[i][2];
				else if(val < arr[i][1] && arr[i][1]>arr[i][2]) val = arr[i][1];
				
				now = val*100;
			}
			
			if(max<now) max = now;
		}
		System.out.println(max);
	}
}
