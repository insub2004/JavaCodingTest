package com.part01;
import java.util.Scanner;

public class EvenTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1부터 N까지의 숫자 중 짝수의 합을 구하는 프로그램을 작성하여라.
		//입력
		//첫째 줄에 N이 주어진다. (1 <= N <= 2000)
		//출력
		//1부터 N까지의 숫자 중 짝수의 합을 출력한다.
		
		//입력 예제
		//10
		//출력 예제
		//30
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int ans = 0;
		
		for(int i=N; i>=1; i--) {
			if(i%2==0) {
				ans += i;
			}
		}
		
		System.out.println(ans);
		
	}

}
