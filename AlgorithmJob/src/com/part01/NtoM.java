package com.part01;
import java.util.Scanner;

public class NtoM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//N���� M���� ����ϴ� ���α׷��� �ۼ��غ���.
		//���� �Է� 
		//1 7
		//���� ��� 
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
