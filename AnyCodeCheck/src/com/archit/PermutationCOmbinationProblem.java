package com.archit;

public class PermutationCOmbinationProblem {
	public static void main(String[] args) {
		String input = "ABCD";
		fill("", input);
	}

	public static void fill(String permutation, String remainingString) {
		if (remainingString.length() == 0) {
			System.out.println(permutation);
		}
		for (int i = 0; i < remainingString.length(); i++) {
			fill(permutation + remainingString.charAt(i),
					remainingString.substring(0, i) + remainingString.substring(i + 1, remainingString.length()));
		}
	}
}
