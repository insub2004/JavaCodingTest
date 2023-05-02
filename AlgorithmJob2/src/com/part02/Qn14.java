package com.part02;

import java.util.Scanner;

public class Qn14 {

	//숫자 피라미드
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int s = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			//짝수번째인 경우 
			if(i%2==0) {	
				for(int k=1; k<=2*i-1; k++) {
					System.out.print(s);
					s++;
					if(s==10) s=1;
				}
			}
			//홀수번째인 경우
			else {
				//배열 생성
				int[] arr = new int[2*i-1];
				for(int h=0; h<arr.length; h++) {
					arr[h] = s;
					s++;
					if(s==10) s=1;
				}
				//배열 뒤에서 부터 출력 시키기
				for(int z=arr.length-1; z>=0; z--) {
					System.out.print(arr[z]);
				}
			}
			System.out.println();
		}
	}
}
