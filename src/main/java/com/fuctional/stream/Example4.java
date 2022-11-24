package com.fuctional.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Example4 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Atim");
		map.put(2, "Chandan");
		map.put(3, "Anil");
		map.put(4, "Deepak");

		// filter the result with start with "A"
		map.entrySet().stream().filter((i) -> i.getValue().startsWith("A")).forEach((i) -> System.out.println(i));

		// filter the result which key is even
		map.entrySet().stream().filter((i) -> i.getKey() % 2 == 0).forEach((i) -> System.out.println(i));
	}

}
