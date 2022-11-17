package com.q20;

import java.util.Scanner;

public class StairNumber {

	// 43분 소요
	// 쓸데없는 배열 안만드는거 잘했다.
	// 처음 생각한 것을 의심하지말고 구현하고 말이 되는 방법으로 접근하자.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int n = sc.nextInt();	// 수열의 갯수
			
			int arr[] = new int[n];	// 수열을 담을 배열
			
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			
			int ans = -1;
			for(int i=0; i<n; i++) {			// i<n 범위 잘 생각하기
				for(int j=i+1; j<n; j++) {
					int val = arr[i]*arr[j];	// 하나씩 곱해서 val에 넣고
					if(getResult(val) > ans) {	// getResult함수를 거쳐서 다져온 결과가
						ans = val;				// -1보다 크면 ans에 담기(계단수중 큰 게 담기게 됨)
					}							// -1만 나오면 결국 -1이 출력
				}
			}
			
			System.out.printf("#%d %d\n", t,ans);
		}
		
	}

	private static int getResult(int x) {
		
		int result = -1;
		
		String str = Integer.toString(x);		//가져온 숫자 비교하기 위해 문자로 바꿔주기
		char[] c = str.toCharArray();			//문자배열에 넣기
		int cnt = 0;							//비교변수
		
		for(int i=0; i<c.length-1; i++) {
			if(Character.getNumericValue(c[i]+1) == Character.getNumericValue(c[i+1])) {
				cnt++;
			}	//만약 현재 숫자(문자)+1 이 뒤의 문자와 같으면 cnt++ : 연속한다고 보기
		}
		
		if(cnt==c.length-1) result = x;		//cnt갯수가 c길이-1이면 계단수 result에 계단수 담기
		return result;						//그렇지 않으면 -1을 리턴
	}
}
