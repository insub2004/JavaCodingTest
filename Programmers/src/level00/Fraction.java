package level00;

public class Fraction {

	public static void main(String[] args) {
		int denum1 = 1;
		int num1 = 2;
		int denum2 = 3;
		int num2 = 4;
		
		int []answer = new int[2];
		
		int ja = denum1*num2 + denum2*num1;
		int mo = num1*num2;
		
		int min = Math.min(ja, mo);
		
		int n=2;
		
		while(n<=min) {
			if(ja%n==0&&mo%n==0) {
				ja/=n;
				mo/=n;
				min=Math.min(ja, mo);
			}else if(ja%n!=0||ja%n!=0) break;
			else n++;
		}
		
		answer[0] = ja;
		answer[1] = mo;
		
		System.out.printf("%d %d", ja, mo);
		
	}
	
}
