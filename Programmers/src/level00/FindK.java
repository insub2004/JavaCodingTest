package level00;

public class FindK {

	public static void main(String[] args) {
		int answer = solution(1,13,1);
		
		System.out.println(answer);
	}
	public static int solution(int i, int j, int k) {
        int answer = 0;
        for(int s=i; s<=j; s++){
        	int num = s;
            while(num>0){
                if(num%10==k) answer++;
                num/=10;
            }
        }
        return answer;
    }
}
