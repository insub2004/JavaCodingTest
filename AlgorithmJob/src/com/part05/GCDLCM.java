package com.part05;

import java.util.Scanner;

public class GCDLCM {

	/* ��Ŭ���� ȣ���� - �ִ�����(GCD)�� ���ϴ� �˰���
	 *  a   b   r<-a��b�� ���� ������
	 * 152 68  20
	 * 68  20  8
	 * 20  8   4
	 * 8   4
	 *
	 * �ִ������� 4
	 */
	
	/*
	 *  �ּҰ����(LCM) ���ϴ� ��
	 *  
	 *  2 | 168  86
	 *  	-------
	 *       84  43  => 2   * 84 	  * 43     = LCM
	 * 					GCD * (A/GCD) * (B/GCD)
	 *  A = aGCD		a = A/GCD -> ������ ������ ������ ������
	 *  B = bGCD		b = B/GCD -> ������ ������ ������ ������
	 *  LCM = abGCD
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int A = a;				//�ּҰ������ ����� ���纻
		int B = b;
		
		int r = 0;
		int GCD = 0; 			//�ִ�����
		int LCM = 0; 			//�ּҰ����
		System.out.print("a  b  r \n");
		while(true) {
			
			r = a%b;
			System.out.printf("%d  %d  %d \n", a,b,r);
			if(r==0) {
				GCD = b;
				break;
			}
			a = b;
			b = r;
		}
		System.out.println("�ִ����� : "+GCD);
		
		LCM = (A/GCD)*(B/GCD)*GCD;		// LCM = (A/GCD)*(B/GCD)*GCD
		
		System.out.println("�ּҰ���� : "+LCM);
		
		
	}






}
