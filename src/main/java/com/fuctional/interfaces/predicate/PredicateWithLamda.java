package com.fuctional.interfaces.predicate;

//Predicate Functional interface : It has one abstract method is called test() method

import java.util.function.Predicate;

public class PredicateWithLamda {

	public static void main(String[] args) {
		Predicate<Integer> predicate = (i) -> {
			if (i % 2 == 0) {
				return true;
			}
			return false;
		};

		boolean res = predicate.test(6);
		System.out.println(res);
	}

}
