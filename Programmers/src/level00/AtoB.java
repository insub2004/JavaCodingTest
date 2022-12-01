package level00;

import java.util.Arrays;

public class AtoB {

	public static void main(String[] args) {
		
		String before = "olleh";
		String after = "hello";
		
		//reverse()메서드를 이용하기 위해 StringBuilder사용
		
//		StringBuilder sbBe = new StringBuilder(before);
//		
//		before = String.valueOf(sbBe.reverse());
//		
//		if(before.equals(after)) System.out.println(1);
//		else System.out.println(0);
		
		// 뒤집는게 아니라 순서만 바꿨을 때 되는가여서 해당 문자가 포함되어있나 보면될꺼같다.
/*		for(int i=0; i<before.length(); i++) {
			after=after.replaceFirst(""+before.charAt(i), "");
			//System.out.println(after);
		}
		if(after.equals("")) System.out.println(1);
		else System.out.println(0);
*/		
		char[] a = before.toCharArray();
		char[] b = after.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		//System.out.println(a);
		//System.out.println(b);
		
		if(new String(a).equals(new String(b))) {
			System.out.println(1);
		}else System.out.println(0);
		
		
		
		
	}
}
