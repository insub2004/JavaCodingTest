package level00;

public class Login {

	public static void main(String[] args) {
		String[][] arr = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
		System.out.println(solution(new String[] {"meosseugi", "1234"},arr));
	}
	
	public static String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        for(int i=0; i<db.length; i++) {
        	if(id_pw[0].equals(db[i][0])) {
        		if(id_pw[1].equals(db[i][1])) {
        			return new String("login");
        		}
        		return new String("wrong pw");
        	}
        }
        
        return answer;
    }
}
