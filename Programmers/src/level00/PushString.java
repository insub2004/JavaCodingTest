package level00;

public class PushString {

	public static void main(String[] args) {
		System.out.println(solution("abc","abc"));
	}
	
	public static int solution(String A, String B) {
        int answer = -1;
        int cnt = 0;
        
        if(A.equals(B)) return answer=0;
        
        StringBuilder sb = new StringBuilder(A);
        
        for(int i=0; i<A.length(); i++) {
        	char last = sb.charAt(sb.length()-1);
        	String res = sb.substring(0, sb.length()-1);
        	String compareStr = last+res;
        	cnt++;
        	if(compareStr.equals(B)) {
        		answer = cnt;
        		break;
        	}
        	sb = new StringBuilder(compareStr);
        }
        
        return answer;
    }
}
