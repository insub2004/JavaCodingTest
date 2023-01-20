package level00;

public class CutPaper {

	public static void main(String[] args) {
		System.out.println(solution(2,5));
	}
	
	public static int solution(int M, int N) {
        
        return (M-1)+((N-1)*M);
    }
}
