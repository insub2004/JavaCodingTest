package com.part01;
import java.util.Scanner;

public class YoonYear {
	
	public static void main(String[] args) {
		
		//������ �־����� ��, �� ������ �������� �ƴ����� �Ǵ��ϴ� ���α׷��� �ۼ��غ���.

		//1. ������ 4�� ����̸� 100�� ����� �ƴ� ����
		//2. 400�� ����� ����
		
		Scanner sc = new Scanner(System.in);
		
		int N =sc.nextInt();

		if(N%4==0 && N%100!=0) {
			System.out.println("Yes");
		}else if(N%400==0) System.out.println("Yes");
		else {
			System.out.println("No");
		}

	}	
}
