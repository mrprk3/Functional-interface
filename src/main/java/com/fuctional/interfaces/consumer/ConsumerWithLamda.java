package com.fuctional.interfaces.consumer;

//#2 Consumer Functional Interface : It has one abstract method which called as accept() method

import java.util.function.Consumer;

public class ConsumerWithLamda {

	public static void main(String[] args) {
		Consumer<Integer> consumer = (t) -> {
			System.out.println("This is internally called accept method :" + t);
		};

		consumer.accept(5);
	}

}
