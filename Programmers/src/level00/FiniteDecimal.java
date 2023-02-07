package level00;

public class FiniteDecimal {
	public static void main(String[] args) {
		System.out.println(solution(3500,500));
	}
	
	public static int solution(int a, int b) {
        int answer = 0;
        int gcd = getGcd(a,b);	//�ִ����� ���ϱ�
        answer = b/gcd;
        
        return answer%3==0 ? 2 : answer%7==0 ? 2:1;
    }
	
	public static int getGcd(int a, int b) {
		int r = 0;
		
		while(b!=0) {
			r = a%b;
			if(r==0) break;
			a = b;
			b = r;
		}
		return b;
	}
}
