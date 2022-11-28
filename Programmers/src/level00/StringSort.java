package level00;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSort {

	public static void main(String[] args) {
		
		String my_string = "hi12392";
		
		String []removeA = my_string.replaceAll("[^0-9]", "").split("");
		
		for(int i=0; i<removeA.length; i++) {
			System.out.printf("%s",removeA[i]);
		}
		
		int []answer = new int[removeA.length];
		System.out.println();
		for(int i=0; i<answer.length; i++) {
			answer[i] = Integer.parseInt(removeA[i]);
		}
		Arrays.sort(answer);
		for(int i=0; i<removeA.length; i++) {
			System.out.printf("%d",answer[i]);
		}
		System.out.println();
		//-----------------------------------------------
		
		//Character.digit() ����غ���
		
		List<String> list = new ArrayList<>();
		
		for(int i=0; i<my_string.length(); i++) {
			char charData = my_string.charAt(i);			//���ڿ����� ���� �ϳ��� ������
					
			if(Character.isDigit(charData)) {				//isDigit�� ������ char�� �����̸� true �ƴϸ� false����
				String strData = String.valueOf(charData);	//���ڰ� ������ ���ڿ� list�� �߰��ϱ� ���ػ�
															//String.valueOf()�޼��带 �̿��� ���ڿ��� ��ȯ���ְ�
				
				list.add(strData);							//���ڿ� ����Ʈ�� �߰��Ѵ�
			}
		}
		
		int []ans01 = list.stream().sorted().mapToInt(Integer::parseInt).toArray();
		
		for(int i:ans01) {
			System.out.print(i+"");
		}
		System.out.println();
		
		//----------------------------------
		// stream�� �̿��� ���ٿ� ������
		int []ans02 = Arrays.stream(my_string.replaceAll("[A-Z|a-z]", "").split("")).sorted().mapToInt(Integer::parseInt).toArray();
		for(int i:ans02) {
			System.out.print(i+"");
		}
		
	}
}
