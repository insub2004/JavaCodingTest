package level00;

import java.util.Scanner;

public class Protractor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int gak = sc.nextInt();
		
		System.out.println(gak==90 ? 2 : gak > 1 && gak<90 ? 1 : gak == 180 ? 4 : 3 );
		
	}
}
