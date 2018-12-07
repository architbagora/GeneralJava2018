package com.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		PatternPerfTest patternPerfTest = new PatternPerfTest();

		long startWithOutOne = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			patternPerfTest.getPatternMatchesWithOutContant();
		}
		long endWithOutOne = System.nanoTime();
		System.out.println("Tame taken by getPatternMatchesWithOutContant : " + (endWithOutOne - startWithOutOne));

		long startWithOne = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			patternPerfTest.getPatternMatchesWithContant();
		}
		long endWithOne = System.nanoTime();

		System.out.println("Tame taken by getPatternMatchesWithContant : " + (endWithOne - startWithOne));

		System.out
				.println("Time Constant is better: " + (endWithOutOne - startWithOutOne) / (endWithOne - startWithOne));

		countApplesAndOranges(7, 11,5, 15,new int[]{-2, 2 ,1},new int[] {5 ,-6});
		
	
	}

	/*
	 * Complete the gradingStudents function below.
	 */
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int appleCount = 0, orangeCount = 0;

		for (int i = 0; i < apples.length; i++) {
			appleCount = appleCount + (apples[i] > 0 ? (((a + apples[i]) - s) >= 0 ? 1 : 0) : 0);
		}

		for (int i = 0; i < oranges.length; i++) {
			orangeCount = orangeCount + (oranges[i] < 0 ? (t - (b + oranges[i]) >= 0 ? 1 : 0) : 0);
		}

		System.out.println(appleCount);
		System.out.println(orangeCount);
	}

}