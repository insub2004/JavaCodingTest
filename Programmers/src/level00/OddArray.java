package level00;

import java.util.ArrayList;

public class OddArray {

	public static void main(String[] args) {
		
		int n = 10;
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<=n; i++) {
			if(i%2!=0)list.add(i);
		}
		
	}
	
}
