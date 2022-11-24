package com.fuctional.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Atim");
		list.add("Anil");
		list.add("Deepak");
		list.add("Chandan");

		// without stream
		for (String s : list) {
			if (s.startsWith("A")) {
				System.out.println(s);
			}
		}

		// using stream, filter and predicate
		List<String> name = list.stream().filter((i) -> i.startsWith("A")).collect(Collectors.toList());
		System.out.println(name);
	}

}
