package com.part05;

public class SieveOfEratosthenes {

	// 에라토스테네스의 체
	// 2부터 자기자신을 제외하고 자신의 배수들을 지우고 다음 남아있는 수를 똑같이 자기자신을 제외하고 배수만 지우는 것을 반복
	
	public static int MAX = 100000;
	public static int a[]=new int[MAX+1];
	
	public static void primeNumberSieve(){
		
		for(int i=2; i<=MAX; i++) {			// 전체에 숫자 입력
			a[i] = i;
		}
		
		for(int i=2; i<=MAX; i++) {
			if(a[i]==0)continue;				// 만약 만난 숫자가 0이면 넘어가고 => i(자기자신 제외)의 배수들이 0임
			for(int j=i+i; j<=MAX; j += i) {	// for(자신은 제외하고 다음 배수부터 시작; 마지막MAX값까지; 다음 배수 숫자로 이동)
				a[j] = 0;						// i:2일경우 (4부터;끝까지;다음6으로)
			}			
		}
		
		for(int i=2; i<=MAX; i++) {
			if(a[i]!=0)System.out.printf("%d ", a[i]);
			if(i%100==0) System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		primeNumberSieve();
		
	}
	
}
