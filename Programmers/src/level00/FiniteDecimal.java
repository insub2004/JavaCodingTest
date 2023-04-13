package level00;

public class FiniteDecimal {
	public static void main(String[] args) {
		System.out.println(solution(12,21));
	}
	
	public static int solution(int a, int b) {
        int answer = 0;
        int gcd = getGcd(a,b);	//최대공약수 구하기
        answer = b/gcd;
        
        return answer%3==0 ? 2 : answer%7==0 ? 2:1;
    }
	
	public static int getGcd(int a, int b) {
		int r = 0;
		
		while(b!=0) {
			r = a%b;
			System.out.println(r);
			if(r==0) break;
			a = b;
			b = r;
		}
		System.out.println("b:"+b);
		return b;
	}
}
