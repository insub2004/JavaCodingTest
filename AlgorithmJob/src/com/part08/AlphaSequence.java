package com.part08;

import java.util.Scanner;

public class AlphaSequence {

	/*
	 * ���� �ٸ� n���� ���ҵ� �߿��� r������ �̾� �Ϸķ� �����ϴ� ���� �����̶� �Ѵ�. 
	 * ���� ���, 3���� ���� a, b, c �߿��� 2������ �̾� �����ϸ� ab, ac, ba, bc, ca, cb �� 6���� ��찡 �ִ�. 
	 * n�� r�� �־��� ��, n���� �ҹ��� �߿��� r������ �̾� �����ϴ� ��� ��츦 ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
	 * ��, a���� �����Ͽ� �������� n���� ���ĺ��� ���� �ִٰ� ����.  

		�Է�
		ù ��° �ٿ� n�� r�� �־�����. ( 1 �� n �� 10, 0 �� r �� min(n, 7) )  
		
		���
		�� �ٿ� n���� �ҹ��� �߿��� r������ �̾� �����ϴ� ��츦 ���������� ������ ����� ����Ѵ�.
	 */
	
	public static int MAX = 105;
	public static int n;	//���ĺ� ��
	public static int r;	//������ ����

	public static char result[] = new char[105];
	public static boolean check[] = new boolean[105];
	
	public static void main(String[] args) {
		
		// �켱 r�� 2�̻� �Ѿ�� for���� �ʹ� ���� ���δ�.
		// ��������� �����ؼ� Ǯ���.
		// ���ĺ��� i-'a'�� ���� i�� 0���� �����ϸ鼭 ��Ÿ���� �ǰ�
		// ����� ����� char�迭�� boolean���� check�迭[0,1,2....] �ǹ̻�[a,b,c...]
		// ����Լ��� x�� ��ŭ for���� ����
		
		Scanner sc = new Scanner(System.in);
		
		// �Է� 2�� �ް�
		n = sc.nextInt();
		r = sc.nextInt();
		
		// 0��° for������ ���ƾ������� 0�� �Ѱ��ش�.
		getSequence(0);
	}

	private static void getSequence(int x) {
		if(x>=r) {		// ���� x�� ����Ϸ��� �������� ũ�ų� ��������(for���� ����) ���ݱ��� ����� ����ع�����.
			for(int i=0; i<r; i++) {
				System.out.printf("%c",result[i]);
			}
			System.out.println();
		}
		else {			// check�� �ؼ� check[x]��°�� true���� false���� Ȯ���ؼ� 
						// false�� result�� �־��ְ� (x+1)�Ѿ��
						// true�� check[x]�������� �ѱ��
			for(int i=0; i<n;i++) {
				char val = (char) (i+'a');
				if(check[i]==false) {
					result[x] = val;		//result�� ���� ���� ���� x�� �־������!!!!
					check[i]=true;		
					
					getSequence(x+1);
					//���ٿ��� false�� ������ְ�
					check[i] = false;
					result[x] = 0;			//������ x�� �������!!!!
				}
			}
		}
	}
	
}
