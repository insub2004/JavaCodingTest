package level00;

public class BinaryPlus {
	
	public static void main(String[] args) {
		String result = solution("1001", "1111");
		System.out.println(result);
	}
	
	public static String solution(String bin1, String bin2) {
		
		int i1 = Integer.parseInt(bin1, 2);
		int i2 = Integer.parseInt(bin2, 2);
		
		return Integer.toBinaryString(i1+i2);
	}
}
