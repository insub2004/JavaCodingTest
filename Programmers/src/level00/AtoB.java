package level00;

import java.util.Arrays;

public class AtoB {

	public static void main(String[] args) {
		
		String before = "olleh";
		String after = "hello";
		
		//reverse()�޼��带 �̿��ϱ� ���� StringBuilder���
		
//		StringBuilder sbBe = new StringBuilder(before);
//		
//		before = String.valueOf(sbBe.reverse());
//		
//		if(before.equals(after)) System.out.println(1);
//		else System.out.println(0);
		
		// �����°� �ƴ϶� ������ �ٲ��� �� �Ǵ°����� �ش� ���ڰ� ���ԵǾ��ֳ� ����ɲ�����.
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
