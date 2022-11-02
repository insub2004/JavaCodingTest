package com.part03;

import java.util.Scanner;

public class ModeMean {

	// 최빈값, 평균 구하기
	
	/*
	 *	입력
		첫째 줄부터 열 번째 줄까지 한 줄에 하나씩 자연수가 주어진다. 주어지는 자연수는 1,000 이하의 10 의 배수이다.

 

		출력	
		첫째 줄에는 평균을 출력하고, 둘째 줄에는 최빈값을 출력한다. 최빈값이 둘 이상일 경우 그 중 최소값을 출력한다. 평균과 최빈값은 모두 자연수이다.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];	//입력받을 값들의 배열
		
		int sum = 0;					
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		
		int avg = sum/10;		//평균값
		
		int maxV = 0;	// 최빈값 담을 변수
		int maxC = -1;  // 최빈값의 빈도수를 담을 변수
		int cnt = 0;	// 빈도수를 셀 변수
		
		for(int i=0; i<arr.length; i++) {
			if(maxV == arr[i]) continue;		// 만약 최빈값을 또 비교하려고 하면 그냥 다음 값으로 넘어가기
			
			for(int j=0; j<arr.length; j++) {
				if(arr[i]==arr[j]) cnt++;
			}
			
			if(cnt > maxC) {
				maxC = cnt;
				maxV = arr[i];
			}else if(cnt == maxC && maxV > arr[i]) {
				maxV = arr[i];
			}
			
			cnt = 0;		// 디버깅의 중요성!!!!!
		}
		
		System.out.println(avg);
		System.out.println(maxV);
	}
	
}
