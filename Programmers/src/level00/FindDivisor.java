package level00;

import java.util.ArrayList;
import java.util.List;

public class FindDivisor {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		int n = 24;
		
		for(int i=1; i<=n; i++) {
			if(n%i==0) list.add(i);
		}
		
		int []inlist = list.stream().sorted().mapToInt(i->i).toArray();
		
		System.out.println(inlist[3]);
		
	}
	
}
