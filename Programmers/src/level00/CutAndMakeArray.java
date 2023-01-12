package level00;

import java.util.*;

public class CutAndMakeArray {

	public static void main(String[] args) {
		String[] re = solution("abc1Addfggg4556b", 6);
		System.out.println(Arrays.toString(re));
	}
	public static String[] solution(String my_str, int n) {
        int startIdx = 0;
        int endIdx = n;
        List<String> list = new ArrayList<String>();
        for(int i=0; i<Math.ceil(my_str.length()/(float)n);i++) {
        	list.add(my_str.substring(startIdx, endIdx));
        	startIdx += n;
        	if(endIdx + n > my_str.length()) endIdx = my_str.length();
        	else endIdx += n;
        }
        String[] answer = new String[list.size()];
//        Iterator it = list.iterator();
//        int idx = 0;
//        while(it.hasNext()) {
//        	answer[idx++] = (String)it.next();
//        }
        for(int i=0; i<list.size(); i++) {
        	answer[i] = list.get(i);
        }
        return answer;
        
    }
}
