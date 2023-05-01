package com.part02;

import java.util.Scanner;

public class Qn04Re {

	public static void main(String[] args) {
		
		int max = 100000;
		int[] arr = new int[max+1];
		
		for(int i=2; i<=max; i++) arr[i] = i;
		
		for(int i=2; i<=max; i++) {
			if(arr[i]==0) continue;
			for(int j=i+i; j<=max; j+=i) {
				arr[j] = 0;
			}
		}
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(int i=n; i<=m; i++) {
			if(arr[i]!=0)System.out.printf("%d ",i);
		}
		
	}
}
