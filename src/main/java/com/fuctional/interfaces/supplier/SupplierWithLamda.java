package com.fuctional.interfaces.supplier;

import java.util.function.Supplier;

public class SupplierWithLamda {

	public static void main(String[] args) {
		Supplier<String> supplier = () -> {
			return "Data not found";
		};
		System.out.println(supplier.get());
	}

}
