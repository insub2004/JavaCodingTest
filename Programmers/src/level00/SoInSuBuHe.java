package level00;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.*;

public class SoInSuBuHe {

	public static void main(String[] args) {
		int[] re = solution(12);
		System.out.println(Arrays.toString(re));
	}
	public static int[] solution(int n) {
        
		Set<Integer> hSet = new HashSet<Integer>();
        int num = 2;
        while(n!=1) {
        	if(n%num==0) {
        		n = n/num;
        		hSet.add(num);
        	}
        	else {
            	num++;	
        	}
        }
        int[] answer = new int[hSet.size()];
        Iterator it = hSet.iterator();
        int idx = 0;
        while(it.hasNext()) {
        	answer[idx++] = (int) it.next();
        }
        Arrays.sort(answer);
        return answer;
    }
}
