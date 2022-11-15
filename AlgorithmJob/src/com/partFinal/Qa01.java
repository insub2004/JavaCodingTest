package com.partFinal;

import java.util.Scanner;

public class Qa01 {

	//입력 M D
	//출력 Monday ~~~
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		
		int D = sc.nextInt();
		
		int res = 0;	//D가 2자리 이상일 때 나머지 담기위한 변수
		String Cal[][] = {{},
					{"","Thursday","Friday","Saturday","Sunday","Monday","Tuesday","Wednesday"},//1
					{"","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"},//2
					{"","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"},//3
					{"","Thursday","Friday","Saturday","Sunday","Monday","Tuesday","Wednesday"},//4
					{"","Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"},//5
					{"","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday","Monday"},//6
					{"","Thursday","Friday","Saturday","Sunday","Monday","Tuesday","Wednesday"},//7
					{"","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"},//8
					{"","Wednesday","Thursday","Friday","Saturday","Sunday","Monday","Tuesday"},//9
					{"","Friday","Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday"},//10
					{"","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"},//11
					{"","Wednesday","Thursday","Friday","Saturday","Sunday","Monday","Tuesday"}};//12
		
		if(D>=1&&D<=7) {
			System.out.println(Cal[M][D]);
		}else if(D%7==0) {
			System.out.println(Cal[M][7]);
		}else{
			res = D%7;
			System.out.println(Cal[M][res]);
		}
	
		
	}
	
}
