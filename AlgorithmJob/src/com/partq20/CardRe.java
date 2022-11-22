package com.partq20;

import java.util.Scanner;

public class CardRe {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			
			String str = sc.next();
			
			int arr[] = new int[str.length()];
			
			for(int i=0;i<arr.length; i++) {
				arr[i] = Character.getNumericValue(str.charAt(i));
			}
			
			int sum = arr[0];	// 어차피 0은 바로 사용 가능하니깐
			int ans = 0;		// 정답변수
			
			for(int i=1; i<arr.length; i++) {
				if(arr[i]==0) continue;
				if(sum<i) {
					if(i==arr.length-1) {
						ans += i-sum;
						continue;
					}
					ans += i-sum;				// 이거 확인
					sum+=i-sum;					// 여기 순서 중요함
					sum+=arr[i];
				}else sum+=arr[i];
			}
			
			System.out.printf("#%d %d\n", t, ans);
			
		}
		
	}
}
