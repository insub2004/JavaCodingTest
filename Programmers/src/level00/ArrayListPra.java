package level00;

import java.util.ArrayList;

public class ArrayListPra {

	public static void main(String[] args) {
		
		int []numlist = {4,5,6,7,8,9,10,11,12};
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<numlist.length; i++) {
			if(numlist[i]%3==0)list.add(numlist[i]);
		}
		
		int answer[] = list.stream().mapToInt(i->i).toArray();
		
		
		
	}
}
