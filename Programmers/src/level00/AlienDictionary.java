package level00;

public class AlienDictionary {

	public static void main(String[] args) {
		System.out.println(solution(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzzx", "loveaw"}));
	}
	
	public static int solution(String[] spell, String[] dic) {
        int answer = 2;
        for(int i=0; i<dic.length; i++) {
            int check = 0;
        	for(int j=0; j<spell.length; j++) {
        		if(dic[i].indexOf(spell[j])==-1) {
        			check = -1;
        			answer = 2;
        			break;
        		}
        	}
        	if(check==0) {
        		answer = 1;
        		break;
        	}
        }
        
        return answer;
    }
}
