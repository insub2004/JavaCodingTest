package com.doit;

import java.util.Scanner;

public class QN17 {

	public static void main(String[] args) {
		// 백준 1427번 내림차순으로 자릿수 정렬하기 (선택정렬)
		
		Scanner sc = new Scanner(System.in);
		
		String st = sc.next();
		
		int arr[] = new int[st.length()];
		
		for(int i=0; i<st.length(); i++) {
			arr[i] = Integer.parseInt(st.substring(i, i+1));
		}
		
		//선택 정렬
		for(int i=0; i<st.length(); i++){
			
			int Max = i;	// 맨 앞에 있는 값이 최댓값으로 가정
			
			for(int j=i+1; j<st.length(); j++) {	// 맨 앞에 있는 값의 바로 뒤의 값들 부터 비교
				if(arr[j] > arr[Max]) {
					Max=j;							// 정렬되지 않는 만큼의 범위 중에 최댓값을 찾음
				}
			}
			
			if(arr[i] < arr[Max]) {
				int tmp = arr[i];
				arr[i] = arr[Max];
				arr[Max] = tmp;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		
	}
}
