package level00;

public class CntSeven {

	public static void main(String[] args) {
		
		int result = solution(new int[] {7,77,37});
		System.out.println(result);
	}
	
	static int solution(int[] array) {
	    int answer = 0;
	    
	    for(int i=0; i<array.length; i++) {
	    	int value = array[i];
	    	while(value>0) {
	    		if(value%10 == 7) answer+=1;
	    		value /= 10;
	    	}
	    }
	    
	    return answer;
	}
}

