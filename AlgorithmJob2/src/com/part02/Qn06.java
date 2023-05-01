package com.part02;

import java.util.Scanner;

public class Qn06 {

	//ÃÖ´ñ°ª
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		int max = 0;
		int idx = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>=max) {
				max = arr[i];
				idx = i+1;
			}
		}
		System.out.println(max+"\n"+idx);
		
	}
}
