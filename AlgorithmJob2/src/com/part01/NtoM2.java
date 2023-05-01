package com.part01;

import java.util.Scanner;

public class NtoM2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int cnt = 0;
		
		for(int i=n; i<=m; i++) {
			System.out.printf("%d ",i);
			cnt++;
			if(cnt==8) {
				System.out.println();
				cnt=0;
			}
		}
	}
}
