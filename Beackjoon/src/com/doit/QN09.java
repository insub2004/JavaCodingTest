package com.doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QN09 {

	static int myArr[];
	static int checkArr[];
	static int checkSecret;
	
	public static void main(String[] args) throws IOException {
		
		// 백준 12891번 DNA 비밀번호
		
		/*
		 * 	
		 */
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		//문자열의 길이와, 부분문자열의 길이
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		//전체 문자열 받고 저장
		char A[] = new char[S];
		A = bf.readLine().toCharArray();	//이거 익숙해지기
		
		// 현재상태배열, 정답비교배열, 갯수비교변수, 출력할답변수
		myArr = new int[4];
		checkArr = new int[4];
		checkSecret = 0;
		int Result = 0;
		
		//정답비교배열에 정답갯수 넣기 { A, C, G, T }
		st = new StringTokenizer(bf.readLine());
		for(int i=0; i<4; i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());
			//근데 0이면 P에 값이 없어도 정답이기 때문에 0이 들어오면 ++해주자
			if(checkArr[i] == 0) checkSecret++;
		}
		
		for(int i=0; i<P; i++) {
			add(A[i]);
		}
		
		// 첫 비교후 result값 올려주기
		if(checkSecret == 4) Result++;
		
		// 나머지 부분 슬라이싱 윈도우 처리하기
		for(int i=P; i<S; i++) {
			int j = i-P;
			add(A[i]);		// 뒷부분 넣어주기	+	너무 배열로 따로 만들어서 처리하려고 생각하지말자
			remove(A[j]);	// 앞부분 넣어주기
			if(checkSecret == 4) Result++;
		}
		
		System.out.println(Result);
		bf.close();
		
		
	}

	private static void remove(char c) {
		switch (c) {
		case 'A':
			if(myArr[0] == checkArr[0]) checkSecret--;
			myArr[0]--;
			break;
		case 'C':
			if(myArr[1] == checkArr[1]) checkSecret--;
			myArr[1]--;
			break;
		case 'G':
			if(myArr[2] == checkArr[2]) checkSecret--;
			myArr[2]--;
			break;
		case 'T':
			if(myArr[3] == checkArr[3]) checkSecret--;
			myArr[3]--;
			break;
		}
	}

	private static void add(char c) {
		switch (c) {
		case 'A':
			myArr[0]++;
			if(myArr[0] == checkArr[0]) checkSecret++;
			break;
		case 'C':
			myArr[1]++;
			if(myArr[1] == checkArr[1]) checkSecret++;
			break;
		case 'G':
			myArr[2]++;
			if(myArr[2] == checkArr[2]) checkSecret++;
			break;
		case 'T':
			myArr[3]++;
			if(myArr[3] == checkArr[3]) checkSecret++;
			break;
		}
	}
}
