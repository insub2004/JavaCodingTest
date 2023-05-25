package com.part02;

import java.util.Scanner;

public class Qn34 {
	
	//싸피 오픈채팅 방 비밀번호 문제...
	//문자열 n개를 A와 B의 조합, 단 B는 딱 두 개 있음 
	//사전식 배열로 k번째 문자열이 있을 때
	//두 번째 B위치를 이진수로 출력하시오
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int cntB = 2;
		int cntA = n-2;
		
		String str = "";
		
		for(int i=0; i<cntA; i++) {
			str += "A";
		}
		
		for(int i=0; i<cntB; i++) {
			str += "B";
		}
		
		char[] arrCh = str.toCharArray();
		
		int sum = 1;
		int cnt = 2; // 1번 옮겼을 때의 발생하는 총 가짓수, 
		int idx = 0;
		
		while(true) {
			if(sum>=k) break;	//밖으로 나가서  k-(cnt-2) => 첫 B를 옮겼을 때의 시작 k
			for(int i=0; i<arrCh.length; i++) {
				if(arrCh[i]=='B') {
					idx = i;
					break;
				}
			}
			char tmp = arrCh[idx];
			arrCh[idx] = arrCh[idx-1];
			arrCh[idx-1] = tmp;

			sum += cnt++;
		}

		int rest = k - (sum-(cnt-2));	//첫 경우에서 부터 k번 째 까지 남은 횟수 

		int result = str.length() - rest;	//두 번째 B는 제일 뒤에서 앞으로 한 칸씩 가기 때문에
											//문자열 길이에서 남은 횟수를 빼주면 B의 두 번째 위치가 나온다.
		String ans = String.format("%04d", Integer.parseInt(Integer.toBinaryString(result)));

		System.out.println(ans);
	}
}
