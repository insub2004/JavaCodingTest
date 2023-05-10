package com.final01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QnB02 {

	//물건 진열
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[200010];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
			arr[i]=arr[i]%2;
		}

		//짝수를 저장하자
		List<Integer> arrList = new ArrayList<Integer>();
		
		//짝수 인덱스 저장
		for(int i=0; i<n; i++) {
			if(arr[i]%2==0) arrList.add(i);
		}
		
		
		
	}
}
