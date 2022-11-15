package com.d2;

import java.util.ArrayList;
import java.util.Scanner;

public class Sheet {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("one");
		al.add("two");
		al.add("three");
		for(int i=0; i<al.size(); i++) {
			String value = (String) al.get(i);
			System.out.println(value);
		}
	}
	
}
