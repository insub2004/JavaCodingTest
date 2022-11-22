package com.partq30;

import java.util.Scanner;

public class DateCnt {

	public static void main(String[] args) {
		
		// 10분
		// 2번 40점 나옴
		// 예외경우 잘 생각하자
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int arr[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		for(int t=1; t<=T; t++) {
			
			int m1 = sc.nextInt();
			int d1 = sc.nextInt();
			int m2 = sc.nextInt();
			int d2 = sc.nextInt();
			
			System.out.printf("#%d ", t);
			int day = 0;
			if(m1==m2&&d1==d2) System.out.printf("%d\n",1);
			else if(m2==m1) System.out.printf("%d\n",d2-d1+1);		//예외조건 생각 잘하자
			else if(m2-m1==1) {
				day = arr[m1]-d1 + d2 + 1;
				System.out.printf("%d\n",day);
			}else {
				for(int i=m1+1; i<m2; i++) {
					day+=arr[i];
				}
				day += arr[m1]-d1 + d2 + 1;
				System.out.printf("%d\n",day);
			}
			
		}
		
	}
}
