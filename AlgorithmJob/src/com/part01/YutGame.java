package com.part01;
import java.util.Scanner;

public class YutGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 배 - 1
		// 등 - 0
		// 도(배1개 등3개)
		// 한 줄 입력 nextLine()
		// 공백 기준 입력 next()

		// 입력 예시
		// 0 1 0 1

		// 4번 반복

		String case1 = null;
		String case2 = null;
		String case3 = null;

		// 입력받고
		case1 = sc.nextLine();
		case2 = sc.nextLine();
		case3 = sc.nextLine();

		// 공백기준으로 나누고
		String[] strarr1 = case1.split(" ");
		String[] strarr2 = case2.split(" ");
		String[] strarr3 = case3.split(" ");

		// 정수형 배열에 담기
		int[] intarr1 = new int[strarr1.length];
		int[] intarr2 = new int[strarr2.length];
		int[] intarr3 = new int[strarr3.length];
		for (int i = 0; i < strarr1.length; i++) {
			intarr1[i] = Integer.parseInt(strarr1[i]);
		}
		for (int i = 0; i < strarr2.length; i++) {
			intarr2[i] = Integer.parseInt(strarr2[i]);
		}
		for (int i = 0; i < strarr3.length; i++) {
			intarr3[i] = Integer.parseInt(strarr3[i]);
		}
		
		// 정수형 배열의 합이 1이면 도 2면 개.....
		int ans1 = 0;
		int ans2 = 0;
		int ans3 = 0;
		
		for (Integer i : intarr1) {
			ans1 += i;
		}
		for (Integer i : intarr2) {
			ans2 += i;
		}
		for (Integer i : intarr3) {
			ans3 += i;
		}
		
		
		int[] prians = {ans1,ans2,ans3};
		
		for(int j=0; j<prians.length; j++) {
			if(prians[j]==0) {
				System.out.println("D");
			}else if(prians[j]==1) {
				System.out.println("C");
			}else if(prians[j]==2) {
				System.out.println("B");
			}else if(prians[j]==3) {
				System.out.println("A");
			}else if(prians[j]==4) {
				System.out.println("E");
			}
		}
		
	}

}
