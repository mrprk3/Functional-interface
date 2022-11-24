package com.fuctional.interfaces.supplier;

//Supplier Functional interface : It has one abstract method called get()

import java.util.function.Supplier;

public class SupplierWithLamda {

	public static void main(String[] args) {
		Supplier<String> supplier = () -> {
			return "Data not found";
		};
		System.out.println(supplier.get());
	}

}
