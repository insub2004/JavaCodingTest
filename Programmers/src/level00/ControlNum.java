package level00;

public class ControlNum {

	public int solution(int n, String control) {
        int answer = 0;
        int w = 0;
        int s = 0;
        int d = 0;
        int a = 0;
        
        for(int i=0; i<control.length();i++){
            char ch = control.charAt(i);
            if(ch=='w') w+=1;
            else if(ch=='s') s-=1;
            else if(ch=='d') d+=10;
            else if(ch=='a') a-=10;
        }
        answer = n + w + s + d + a;
        return answer;
    }

}
    