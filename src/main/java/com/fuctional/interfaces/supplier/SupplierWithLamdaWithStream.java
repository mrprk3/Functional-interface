package com.fuctional.interfaces.supplier;

//Supplier Functional interface : It has one abstract method called get()

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierWithLamdaWithStream {

	public static void main(String[] args) {
		List<String> lists = Arrays.asList("Atim");
		Supplier<String> supplier = () -> {
			return "Data not found";
		};
		System.out.println(lists.stream().findAny().orElseGet(supplier));
	}

}

//In the above example if any data is present in the names then won't do anything and if data is not present it will print Data not found'