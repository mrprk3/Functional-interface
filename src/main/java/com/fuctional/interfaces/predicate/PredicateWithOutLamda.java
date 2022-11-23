package com.fuctional.interfaces.predicate;

//Predicate Functional interface : It has one abstract method is called test() method

import java.util.function.Predicate;

public class PredicateWithOutLamda implements Predicate<Integer> {

	public static void main(String[] args) {
		PredicateWithOutLamda pobj = new PredicateWithOutLamda();
		boolean res = pobj.test(19);
		if (res == true) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

	@Override
	public boolean test(Integer t) {
		if (t % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
