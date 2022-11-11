package com.part08;

import java.util.Scanner;

public class RecursionSequence {

	/*
	 * N���� ���ĺ� �߿� R���� ������ �� �ִ� ��츦 ��� ���
	 * 
	 * 3 2
	 * 
	 * ab
	 * ac
	 * ba
	 * bc
	 * ca
	 * cb
	 */

	public static int MAX = 105;
	
	
	public static Scanner sc = new Scanner(System.in);
	public static int n;	//���ĺ� ��
	public static int m;	//����� ��
	public static char result[] = new char[MAX];	//����� ���� �迭
	
	// �ǹ̻� [a,b,c,d,---]�� �迭�ε� false�̸� ���ٴ°� true�̸� �ִٰ� Ȯ���ϴ� �迭
	public static boolean check[] = new boolean[MAX];
	
	public static void main(String[] args) {
		
		//�켱 ���ڸ� ǥ���ϰ� �ʹ� �ϸ� char = +'���ĺ�'
		//    ���ڸ� ǥ���ϰ� �ʹ� �ϸ� char = +'0' �� ������
		/*
		char a = 0+'a';
		char b = 1+'a';
		char c = 3+'0';
		System.out.println((int)1+'a');
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		*/
		n =	sc.nextInt();
		m = sc.nextInt();
		
		// �켱 ����� ������ �ذ��� �� �ֳ�?
		// 3 2�̸� abc�� ���鼭 ab ac �̷��� ã�ƾ��ϴ� for�� 2���� ���ƾ��Ѵ�.
		// ���ƾ� �ϴ� Ƚ���� Ŀ���� �ð����⵵�� Ŀ���� for���� �ø��⺸�� �׷� ����Լ��� Ǯ���
		
		getSequence(0);		//0�� �����ִ� ������ ����迭�� 0��°�� ù ����� ���� for������ ���� 
							
		
	}

	// a��° for���� ��� ������� ��
	private static void getSequence(int a) {
		//�������� ��������
		//���� a(result�� �ε��� = for���� Ƚ��)�� m(����Ϸ��� ����)���� ũ�ų� ���� ��
		//result�� ���������
		if(a>=m) {
			for(int i=0; i<m; i++) {
				System.out.printf("%c",result[i]);
			}
			System.out.println();
		}
		//���� ����Լ� �κл����غ���
		//���� for�� 0���� ����(a���� �ֱ�����)�ؼ� result�迭�� �ش� ���ĺ��� �������� ������
		//���� ��ġ�� ���ĺ��� �ְ� +1�ؼ� ����Լ��� ��ȣ��
		//ȣ���� ������ ������ result�迭�� ����ֱ�
		else {
			for(int i=0; i<n; i++) {	//n������ ������ 0->a 1->b 2->c ó�� n���� �����ϹǷ�
				char val = (char) (i +'a');
				if(check[i]==false) {
					result[a] = val;	// ����迭�� �� �ְ�
					check[i] = true;	// üũ�迭�� true�� �־��ֱ�
					
					getSequence(a+1);
					//���� a��°���� i�� �ִ� ��츦 �� ����ϰ� ���ͼ�
					check[i] = false;	//�̷��� �ٽ� a���� �� �� �ִ�.
					result[a] = 0;
				}
			}
		}
	}
}
