package com.q20;

import java.util.Scanner;

public class SamyucguRe {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int cnt=0;

		for(int i=1; i<=n; i++) {
			cnt = getCnt(i);
			if(cnt==0) System.out.printf("%d ", i);
			else {
				for(int j=0; j<cnt; j++) {
					System.out.print("_");
				}
				System.out.print(" ");
			}
		}	
	}
	
	public static int getCnt(int x) {
		
		int cnt=0;
		
		while(x>0) {
			if(x%10==3 || x%10==6 || x%10==9) cnt++;
			x/=10;
		}
		
		return cnt;
	}
}
