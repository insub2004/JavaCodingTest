package com.part02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Qn23 {

	//대푯값
	//평균, 최빈값(둘 이상일 경우 최소값을 출력)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[1001];
		
		int avg = 0;
		int sum = 0;
		int many = 10;
		
		for(int i=0; i<10; i++) {
			int val = sc.nextInt();
			sum+=val;
			arr[val]++;
		}
		
		avg = sum/10;
		
		for(int i=10; i<arr.length; i+=10) {	//10이 배수니깐
			if(arr[i]>arr[many]) {
				many=i;
			}
		}
		
		System.out.println(avg+"\n"+many);
		
	}
}