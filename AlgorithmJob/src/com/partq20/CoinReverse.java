package com.partq20;

import java.util.Scanner;

public class CoinReverse {

	//17분 소요
	//Arrays.fill(arr, -1);로 배열값을 다른걸로 채울 수 있네
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			
			String st = sc.next();		// 배열의 길이를 알아야하니깐 문자열로 먼저 받자
			
			int arr[] = new int[st.length()];	// 입력받은 만큼 배열 생성
												// 배열을 그냥 크게 만들면 
			for(int i=0; i<st.length(); i++) {
				arr[i] = Character.getNumericValue(st.charAt(i));
			}									// int형 arr[]배열에 값 채워넣기
			
			int cnt = 0;					
			int val = 0;						// 처음엔 뒷면 0부터 시작이니깐
				
			for(int i=0; i<arr.length; i++) {
				if(arr[i] != val) {				// 다른걸 만나면 뒤집어주는걸 반복
					val = arr[i];				// 비교변수에 현재값으로 바꿔주고
					cnt++;						// 카운트 하나 올려주기
				}
			}
			
			System.out.printf("#%d %d\n", t,cnt);
			
		}
		
	}
}
