package level00;

public class SeparateMarble {

	public static void main(String[] args) {
		System.out.println(solution(5,3));
	}
	
	public static int solution(int balls, int share) {
        int answer = 0;
        int ja = 1;
        int mo = 1;
        for(int i=share; i>0; i--) {
        	ja*=balls--;
        	mo*=share--;
        }
                
        return ja/mo;
    }
}
