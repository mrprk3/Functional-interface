package com.fuctional.interfaces.supplier;

//Supplier Functional interface : It has one abstract method called get()

import java.util.function.Supplier;

public class SupplierWithOutLamda implements Supplier<String> {

	public static void main(String[] args) {
		SupplierWithOutLamda obj = new SupplierWithOutLamda();
		System.out.println(obj.get());
	}

	@Override
	public String get() {
		return "Atim How are you";
	}

}
