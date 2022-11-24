package com.fuctional.stream;

// In this example iterate using stream and forEach 

import java.util.ArrayList;
import java.util.List;

public class Example1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Atim");
		list.add("Anil");
		list.add("Deepak");
		list.add("Chandan");
		// using stream and forEach
		list.stream().forEach((i) -> System.out.println(i));
		// without using stream
		for (String s : list) {
			System.out.println(s);
		}
	}

}
