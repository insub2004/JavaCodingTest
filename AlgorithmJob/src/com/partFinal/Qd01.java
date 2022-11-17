package com.partFinal;

import java.util.Scanner;

public class Qd01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int cnt = 0;
		int val = N;
		boolean flag = true;
		int check = 0;
		int x = 0;

		while (flag) {
			int res = val / 10;
			if (N < 10 || check == 0) {		// 1번 조건 굉장히 중요하네
				x = N;
				check = 1;
			}
			x = val % 10; // 합 전의 오른쪽 자리 수
			int sum = res + x;
			val = (x) * 10 + sum % 10;
			cnt++;
			if (N == val)
				flag = false;
		}

		System.out.println(cnt);
	}
}
