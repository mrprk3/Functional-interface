package com.fuctional.interfaces.consumer;

//#3  Consumer Functional Interface : It has one abstract method which called as accept() method

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerWithLamdaWithStream {

	public static void main(String[] args) {
		List<Integer> lists = Arrays.asList(1, 2, 4, 3, 5, 6);
		Consumer<Integer> consumer = (i) -> {
			System.out.println(i);
		};
		lists.stream().forEach(consumer);
	}
}
