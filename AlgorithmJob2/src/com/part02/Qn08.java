package com.part02;

import java.util.Scanner;

public class Qn08 {

	// 두 번째 최솟값 찾기
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] arrcpy = new int[9];
		arrcpy = arr.clone();
		
		//선택정렬
		for(int i=0; i<arrcpy.length; i++) {
			int idx = i;
			for(int j=i; j<arrcpy.length; j++) {
				if(arrcpy[idx] > arrcpy[j]) {
					idx = j;
				}
			}
			int tmp = arrcpy[i];
			arrcpy[i] = arrcpy[idx];
			arrcpy[idx] = tmp;
		}
		
		
		
		int ans = arrcpy[1];
		int ansIdx = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == ans) ansIdx = i;
		}
		
		System.out.println(ans);
		System.out.println(ansIdx+1);
		
	}
}
