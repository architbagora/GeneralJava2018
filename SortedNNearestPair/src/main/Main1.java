package main;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
	// Complete the countSubSequence function below.
	public static int requiredAmountAtStart(List<Integer> netSaving) {
		if(netSaving == null || netSaving.size() == 0){
			return 0;
		}
		
		int miimumAmtToHave = 0;
		int totalCount = 0;
		for (Integer savings : netSaving) {
			totalCount = totalCount + savings;
			if(totalCount < 0 && miimumAmtToHave < -totalCount){
				miimumAmtToHave = -totalCount;
			}
		}
		
		return miimumAmtToHave > 0 ? miimumAmtToHave+1: 0 ;
	}

	public static void main(String[] args) {
		List intList = new ArrayList<Integer>();
		intList.add(6);
		intList.add(-2);
		intList.add(-4);
		intList.add(5);
		intList.add(-7);
		System.out.println(requiredAmountAtStart(intList));

		intList = new ArrayList<Integer>();
		intList.add(6);
		intList.add(-8);
		intList.add(5);
		intList.add(-11);
		intList.add(-6);
		System.out.println(requiredAmountAtStart(intList));
		
		
		
		intList = new ArrayList<Integer>();
		intList.add(3);
		intList.add(4);
		intList.add(2);
		intList.add(-3);
		System.out.println(requiredAmountAtStart(intList));

		
		
		
	}
}
