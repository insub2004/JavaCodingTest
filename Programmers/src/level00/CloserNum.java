package level00;

public class CloserNum {
	public static void main(String[] args) {
		
	}
	
	public int solution(int[] array, int n) {
        int answer = 99;
        int num = 100;
        for(int i=0; i < array.length; i++){
            if(Math.abs(n-array[i]) <= answer){
                if(num > array[i]){
                  num = array[i];  
                } 
            }
        }
        
        return answer;
    }
}
