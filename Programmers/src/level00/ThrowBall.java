package level00;

public class ThrowBall {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,2,3,4,5,6,7,8,9},17));
	}
	
	public static int solution(int[] numbers, int k) {

        int idx = 0;
        int cnt = 0;	// ���̰� Ȧ�� �� �� idx�� 0or1�� �������� �� �� ����
        while(k!=1) {
        	idx += 2;
        	if(idx > numbers.length-1) {
        		if(numbers.length%2 != 0 && cnt%2==0) {
        			idx=1;
        			cnt++;
        		}
        		else {
        			idx=0;
        			cnt++;
        		}
        		if(numbers.length%2==0) idx=0;
        	}
        	k--;
        }
        
        return numbers[idx];
    }
}
