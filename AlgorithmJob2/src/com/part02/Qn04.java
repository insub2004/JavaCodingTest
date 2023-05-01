package com.part02;

import java.util.Scanner;

public class Qn04 {

	public static int MAX = 100000;
	public static int[] arr = new int[MAX+1];
	
	public static void eratos(int a, int b) {
		
		//1) 2부터 MAX까지 배열 채우기
		for(int i=2; i<=MAX; i++) {
			arr[i] = i;
		}
		
		//2) 자기자신을 제외한 배수 지우기
		for(int i=2; i<=MAX; i++) {
			//만난 숫자가 0이면 넘기기
			if(arr[i]==0)continue;
			//자기자신을 제외한 배수들 지워나가기
			//(j=i+i;MAX;j+=i(다음배수))
			for(int j=i+i;j<=MAX;j+=i) {
				arr[j]=0;
			}
		}
		
		//3) a부터 b까지 중 체에서 약수 출력하기
		for(int i=a; i<=b; i++) {
			if(arr[i]==0) continue;
			else System.out.printf("%d ",i);
		}
	}
	
	//소수 판별2
	public static void main(String[] args) {
		
		//1) 2와 3으로 나눠지는게 아니면 일단 출력해보자 (불가 2와 3이 출력이 안됨)
		//2) 에라토스테네스의 체를 이용해서 풀어보자
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		eratos(n,m);
	}
}
