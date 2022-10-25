package com.part02;

import java.util.Scanner;

public class NumberPyramid {

	public static void main(String[] args) {

		/*
		 * N과 시작 숫자 S가 주어지면 숫자 피라미드를 만드는 프로그램을 작성하시오. 예를 들어, N이 5이고 S가 3 이라면, 그 숫자 피라미드는
		 * 다음과 같다.
		 * 
		 *     3 
		 *    456 
		 *   21987 
		 *  3456789 
		 * 987654321
		 * 
		 * 시작 숫자 S는 꼭대기부터 1씩 증가한다. 시작 행의 번호가 1번이라고 했을때, 짝수번째 행은 왼쪽에서 오른쪽으로 1씩 증가하도록 적고,
		 * 홀수번째 행은 거꾸로 적는다. 숫자가 만약 10이 될 경우, 1로 바꾸고 다시 증가한다.
		 * 
		 * 입력 입력의 첫 번째 줄에 N과 시작 숫자 S가 주어진다. ( 1≤N≤100, 1 ≤S≤ 9)
		 * 
		 * 출력 첫 번째 줄부터 숫자 피라미드를 출력한다. (각 줄에 존재하는 공백의 개수와 숫자의 개수를 정확하게 확인해주시바랍니다.)
		 * 
		 * 입출력 예제
		 * 
		 * 5 3 
		 * 
		 *     3 
		 *    456 
		 *   21987
		 *  3456789 
		 * 987654321
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		// 총 행의 갯수
		int n = sc.nextInt();

		// 시작 숫자
		int s = sc.nextInt();

		// 짝수행일 때 시작 숫자
		int even = 0;
		
		// 홀수행일 때 시작 숫자
		int odd = s;

		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			if (i == 1) {
				System.out.print(odd);
				even = odd+1;
			} else if (i % 2 == 0) { // 짝수행일 때 두번째 줄 시작숫자가 무조건 홀수행의 첫번째 숫자+1
				for (int j = 1; j < i * 2; j++) {
					System.out.print(even);
					even++;
					if (even == 10) {
						even = 1;
					}
				}
			} else { // 홀수행일 때 세번째 줄 시작숫자가 무조건 s-1로 시작하고 1씩 감소
				even=even-1;
				for (int j = 1; j < i * 2; j++) {
					even++;
					if(even==10) {
						even=1;
					}
				}
				odd=even;
				for (int j=1;j<i*2;j++) {
					if(j==1) {
						even = odd+1;
					}
					System.out.print(odd);
					odd--;
					if(odd==0) {
						odd=9;
					}
				}
			}
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
