package com.fuctional.interfaces.consumer;

// #1 Consumer Functional Interface : It has one abstract method which called as accept() method

import java.util.function.Consumer;

public class ConsumerWithOutLamda implements Consumer<Integer> {

	public static void main(String[] args) {
		ConsumerWithOutLamda obj1 = new ConsumerWithOutLamda();
		obj1.accept(2);

	}

	@Override
	public void accept(Integer t) {
		System.out.println("This is accept method : " + t);
	}

}
