package level00;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class Emergency {

	public static void main(String[] args) {
	
		int[] emergency = {3, 76, 24};
		
		int[] answer = solution(emergency);
		
		System.out.println(Arrays.toString(answer));
		
	}
	
	public static int[] solution(int[] emergency) {
        int[] answer = emergency;
        int[] preanswer = Arrays.copyOf(answer, answer.length);
        int[] result = new int[answer.length];
        HashMap<Integer, Integer> map  = new HashMap<>();
        Arrays.sort(answer);
        int idx = answer.length;
        for(int i=0; i<answer.length; i++) {
        	map.put(answer[i], idx);
        	idx--;
        }
//        for (Entry<Integer, Integer> entrySet : map.entrySet()) {
//            System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
//        }
        for(int i=0; i<answer.length; i++) {
        	result[i] = map.get(preanswer[i]);
        }
        return result;
    }
}
