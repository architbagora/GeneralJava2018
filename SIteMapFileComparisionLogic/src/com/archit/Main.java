package com.archit;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> srcList = getMeSourceList();
		List<String> tarList = getMeTargetList();
		
		List<String> notMatching = new ArrayList<>();
		long start =System.nanoTime();
		
		List<String> temp = new ArrayList<>(srcList);
		
        srcList.removeAll(tarList);
        tarList.removeAll(temp);

		
		System.out.println("SRC"+ srcList);
		System.out.println("Tar"+ tarList);
		
		System.out.println("TOOK : "+ (System.nanoTime()-start));
	}
	
	
	
	static List<String> getMeSourceList(){
		List<String> srcList =new ArrayList<String>();
		srcList.add("A");
		srcList.add("B");
		srcList.add("C");
		srcList.add("D");
		return srcList;
	}

	static List<String> getMeTargetList(){
		List<String> srcList =new ArrayList<String>();
		srcList.add("C");
		srcList.add("D");
		srcList.add("E");
		srcList.add("F");
		return srcList;
	}
}
