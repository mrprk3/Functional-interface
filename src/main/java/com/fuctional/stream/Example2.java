package com.fuctional.stream;

import java.util.HashMap;
import java.util.Map;

public class Example2 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Atim");
		map.put(2, "Chandan");
		map.put(3, "Anil");
		map.put(4, "Deepak");
		// using only forEach
		map.forEach((key, value) -> System.out.println(key + " : " + value));

		// using stream and forEach
		map.entrySet().stream().forEach((t) -> System.out.println(t));
	}

}
