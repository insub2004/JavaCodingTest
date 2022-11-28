package level00;

public class FindNum {

	public static void main(String[] args) {
		
		int num = 29183;
		int k = 1;
		int answer =-1;
		String[] str = String.valueOf(num).split("");
		int[] arrNum = new int[str.length];
		for(int i=0; i<arrNum.length; i++) {
				arrNum[i] = Integer.parseInt(str[i]);
		}
		
		for(int i=0; i<arrNum.length; i++) {
			if(arrNum[i] == k) {
				answer = i+1;
				break;
			}
		}
		System.out.println(answer);
	}
	
}
