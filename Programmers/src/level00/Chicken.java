package level00;

public class Chicken {

	public static void main(String[] args) {
		System.out.println(solution(1999));
	}
	
	public static int solution(int chicken) {
        int answer = 0;
        int coupon = 0;
        
        while(chicken>9) {
        	answer += chicken/10;
        	coupon += chicken%10;
        	chicken = (chicken/10)+coupon;
        	coupon = 0;
        }
        
        return answer;
    }
}
