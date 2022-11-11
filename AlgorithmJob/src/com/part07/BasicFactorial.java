package com.part07;

import java.util.Scanner;

public class BasicFactorial {

	// �⺻���� ����Լ��� ���丮���� �̿��ؼ� ������
	// ����Լ� -> �ͳ������� ����ϴ� ���
	/* ����Լ� ������ 3���� ����
	 * 1) �Լ��� ������ ���� ��Ȯ�ϰ� ǥ������.
	 * 2) ��������(Base condition)���� �Լ��� ����� �������� ���δ�.
	 * 3) �Լ���(����input�� ���Ͽ�) ����� �����Ѵٰ� �����ϰ� �Լ��� �ϼ��Ѵ�.
	 */
	public static int getFact(int n) {
		
		if(n==0) return 1;
		else return n*getFact(n-1);
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(getFact(n));
		
	}
}
