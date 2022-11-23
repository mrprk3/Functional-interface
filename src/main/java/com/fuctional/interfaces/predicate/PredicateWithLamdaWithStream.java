package com.fuctional.interfaces.predicate;

//Predicate Functional interface : It has one abstract method is called test() method

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateWithLamdaWithStream {

	public static void main(String[] args) {
		List<Integer> lists = Arrays.asList(1, 3, 2, 4, 5, 6, 8, 7);
		Predicate<Integer> predicate = (i) -> {
			if (i % 2 == 0) {
				return true;
			} else {
				return false;
			}
		};

		lists.stream().filter(predicate).forEach((i) -> {
			System.out.println("Even : " + i);
		});
	}

}
