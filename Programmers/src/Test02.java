
public class Test02 {

	public static void main(String[] args) {
		
		char ch01 = 'A';
		
		System.out.printf("%c + %c = %d\n", ch01, 1, ch01+1);
		System.out.printf("%c + %d = %c\n", ch01, 1, ch01+1);
		
		
		StringBuilder a = new StringBuilder("abc");
		StringBuilder b = new StringBuilder("abc");
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		int i=1;
		int mul=1;
		while(true) {
			mul *= i;
			if(mul==7) break;
			else if(mul>7) {
				i--;
				break;
			}
			i++;
		}
		System.out.println(i);
	}
}
