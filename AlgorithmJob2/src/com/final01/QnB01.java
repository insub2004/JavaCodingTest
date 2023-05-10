package com.final01;

import java.util.Scanner;

public class QnB01 {

	//Al Finger Care
	public static void main(String[] args) {
		
		String[] arr = {"1qaz","2wsx","3edc","4rfv5tgb","67yuhjnm","8ik,","9ol.","0-=p[];/'"};
		int[] arrCnt = new int[8];
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();

		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<arr.length;j++) {
				if(arr[j].contains(str.charAt(i)+"")) arrCnt[j]++;
			}
		}
		
		for(int i=0; i<arrCnt.length; i++) {
			System.out.print(arrCnt[i] + " ");
		}
		
	}
}
