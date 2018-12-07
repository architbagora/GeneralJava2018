package com.archit;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<String> list = getMeListOfIntegers(100000);
		List<String> listOfStrings = null; 
		
		long startFor = System.nanoTime();
		listOfStrings = new ArrayList<>();
		for (String integer : list) {
			listOfStrings.add(integer + "A");
		}
		long endFor = System.nanoTime();
		System.out.println("TIME TAKEN BY DEAR FOREACH : " + (endFor - startFor));

		
		long startStream = System.nanoTime();
		listOfStrings = list.stream().map(integer -> integer+"A").collect(Collectors.toList());
		long endStream = System.nanoTime();

		System.out.println("TIME TAKEN BY STREAM : " + (endStream - startStream));

		System.out.println("Multiples : " + ((endStream - startStream) / (endFor - startFor)));
	}

	public static List<String> getMeListOfIntegers(int sizeOfList) {
		List<String> listOfInteger = new ArrayList<String>();
		for (int i = 0; i < sizeOfList; i++) {
			listOfInteger.add(Integer.valueOf(i).toString());
		}
		return listOfInteger;
	}
}
