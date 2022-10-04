package com.part01;
import java.util.Scanner;

public class NtoM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//N부터 M까지 출력하는 프로그램을 작성해보자.
		//예제 입력 
		//1 7
		//예제 출력 
		//1 2 3 4 5 6 7
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		while(a<=b) {
			System.out.print(a);
			System.out.print(" ");
			a++;
		}
		
		
	}

}
