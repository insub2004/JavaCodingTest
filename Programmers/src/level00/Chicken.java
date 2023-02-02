package level00;

public class Chicken {

	public static void main(String[] args) {
		System.out.println(solution(1999));
	}
	
	public static int solution(int chicken) {
        int answer = 0;
        int res = 0;
        while(chicken>0){
            answer += chicken/10;
            res += chicken%10;
            if(res == 10) {
            	answer++;
            	res=0;
            }
            chicken/=10;
        }
        
        return answer;
    }
}
