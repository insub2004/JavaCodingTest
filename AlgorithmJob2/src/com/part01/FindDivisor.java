package com.part01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindDivisor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int val = 0;
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) k--;
			if (k == 0) {
				val = i;
				break;
			}
		}
		
		System.out.println(val);

	}
}
