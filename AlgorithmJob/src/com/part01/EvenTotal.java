package com.part01;
import java.util.Scanner;

public class EvenTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1���� N������ ���� �� ¦���� ���� ���ϴ� ���α׷��� �ۼ��Ͽ���.
		//�Է�
		//ù° �ٿ� N�� �־�����. (1 <= N <= 2000)
		//���
		//1���� N������ ���� �� ¦���� ���� ����Ѵ�.
		
		//�Է� ����
		//10
		//��� ����
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
