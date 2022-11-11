package com.part08;

import java.util.Scanner;

public class AlphaSequence02 {

	/*
	 * ���� �ٸ� n���� ���ҵ� �߿��� r������ �̾� �Ϸķ� �����ϴ� ���� �����̶� �Ѵ�. 
	 * ���� ���, 3���� ���� a, b, c �߿��� 2������ �̾� �����ϸ� ab, ac, ba, bc, ca, cb �� 6���� ��찡 �ִ�. 
	 * n�� r�� �־��� ��, n���� �ҹ��� �߿��� r������ �̾� �����ϴ� ��� ��츦 ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
	 * ��, a���� �����Ͽ� �������� n���� ���ĺ��� ���� �ִٰ� ����.  

		�Է�
		ù ��° �ٿ� n�� r�� �־�����. ( 1 �� n �� 10, 0 �� r �� min(n, 7) )  
		
		���
		�� �ٿ� n���� �ҹ��� �߿��� r������ �̾� �����ϴ� ��츦 ���������� ������ ����� ����Ѵ�.
		
		�ٸ� Ǯ�̷� �ִ��� �Ⱥ��� Ǯ���.(check[]�Ⱦ���)
	 */
	
	//�ٸ� �Լ������� �����ϴ� ������ ���������� ���� ��
	
	public static int n;
	public static int r;
	public static int[] result = new int[26];
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		r = sc.nextInt();
		
		getResult(0);		//result�� 0��°���� ä�������� ������ 0�� �Ѱ��ش�.
							//0��° for��
		
	}

	private static void getResult(int x) {
		// r�� for���� ���� �Լ�
		
		boolean flag = false;
		// �켱 �������� �� ��
		if(x>=r) {			//for���� ���� ����� ������ �������Ÿ� i��ŭ �� ���� ��
			//�ٵ� ���� aaa���� �ߺ��� ��찡 result�̸� ��� �����ֱ� ���ؼ� flag���� ���
			for(int i=0; i<r; i++) {	//�ߺ��� ��� ����for���� �̿�����.
				for(int j=0; j<r; j++) {
					if(i!=j && result[i] == result[j]) flag = true;
					// �ڸ��� �ٸ��鼭 �迭���� ������ �ߺ��̶�� ��
				}
			}
			if(flag==false) { //���� ����� ���� �ߺ����� �ʾҴٴ� ��
				for(int i=0; i<r; i++) {
					System.out.printf("%c", result[i]+'a');
				}
				System.out.println();
			}
		}
		else {
			for(int i=0; i<n; i++) {
				result[x] = i;
				getResult(x+1);
			}
		}
		
	}
}
