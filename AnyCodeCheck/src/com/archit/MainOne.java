package com.archit;

import java.util.List;

import java.util.ArrayList;

public class MainOne {
public static void main(String[] args) {
	List<String> names = new ArrayList<>();
	
	names.add("Nagpraveen");
	names.add("Archit");
	names.add("Jagadish");
	names.add("DevD");
	names.add("Bholi");
	
	
	for(String name: names){
		System.out.println(name);
		removeMe(names);
		System.out.println(names);
	}
	System.out.println("HODNEEEEEEE");
	
}

private static void removeMe(List<String> names) {
	names.remove("Archit");
	names.remove("Jagadish");
	//names.remove("DevD");
	names.remove("Bholi");
	names.remove("Nagpraveen");
}
}
