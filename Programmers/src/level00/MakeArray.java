package level00;

public class MakeArray {

	public static void main(String[] args) {
		int[] arr = solution(10,3);
		for(int i:arr) {
			System.out.println(i);
		}
	}
	
    public static int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int idx = 0;
        int mul = 2;
        int num = k;
        while(num <= n){
            answer[idx] = num;
            num = k*mul;
            idx++;
            mul++;
        }
        return answer;
    }
}
