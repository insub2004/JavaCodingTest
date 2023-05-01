package com.part02;

import java.util.Scanner;

public class Qn1102 {

	//결론 : 모든 문제를 처음부터 배열에 담으려고 생각하지말자
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = 0;
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			int val = 0;
			
			if(a==b && b==c) {
				val = 10000+a*1000;
			}
			else if(a==b && b!=c) {
				val = 1000+a*100;
			}
			else if(a==c && b!=c) {
				val = 1000+a*100;
			}
			else if(b==c && a!=b) {
				val = 1000+b*100;
			}
			else {
				if(a>b && b>c) val = a*100;
				else if(b>a && b>c) val = b*100;
				else val=c*100;
			}
			if(result < val) result = val;
		}
		System.out.println(result);
	}
}
