package com.educative.hashmap;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class HashMapDemo {

	public static void main(String args[]) {

		Map<String, Integer> stockPrice = new HashMap<>();

		stockPrice.put("Oracle", 56);
		stockPrice.put("Fiserv", 117);
		stockPrice.put("BMW", 73);
		stockPrice.put("Microsoft", 213);
		stockPrice.put("Google", 421);
		stockPrice.put("Ford", 456);
		stockPrice.put("Novartis", 43);
		stockPrice.put("TCS", 23);
		Predicate<Integer> isEven = x -> x >= 2;
		OptionalDouble a = stockPrice.values().parallelStream().mapToInt(x -> x).average();
		System.out.println(isEven.test(2) + " " +a.orElseGet(null) );
	}
}
