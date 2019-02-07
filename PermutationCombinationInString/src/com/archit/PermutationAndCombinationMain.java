package com.archit;
import java.util.Arrays;

public class PermutationAndCombinationMain {

	public static void main(String[] args) {
		String input = "ABCD";
		char[] inputChar = input.toCharArray();
		permute(inputChar);

	}

	private static void permute(char[] inputChar) {
		fillArray(new char[inputChar.length], 0, inputChar);
	}

	private static void fillArray(char[] copyArray, int locationToFill, char[] charsLeft) {
		if (charsLeft.length == 0) {
			System.out.println(Arrays.toString(copyArray));
			return;
		}
		for (int i = 0; i < charsLeft.length; i++) {
			copyArray[locationToFill] = charsLeft[i];
			locationToFill++;
			charsLeft = removeIthChar(charsLeft, i);
			fillArray(copyArray, locationToFill, charsLeft);
			locationToFill--;
			charsLeft = fillIthChar(charsLeft, i, copyArray[locationToFill]);
		}

	}

	// Archit: Method to add the char supplied at i'th position.
	private static char[] fillIthChar(char[] charsLeft, int location, char c) {
		char[] copyChar = new char[charsLeft.length + 1];
		int j = 0;
		for (int i = 0; i < charsLeft.length; i++) {
			if (location == i) {
				copyChar[location] = c;
				j++;
			}
			copyChar[i + j] = charsLeft[i];
		}
		return copyChar;
	}

	//ARCHIT : MEthod for removing i'th char from array supplied. 
	private static char[] removeIthChar(char[] charsLeft, int location) {
		char[] copyChar = new char[charsLeft.length - 1];
		int j = 0;
		for (int i = 0; i < charsLeft.length; i++) {
			if (location == i) {
				j++;
			} else {
				copyChar[i - j] = charsLeft[i];
			}
		}
		return copyChar;
	}
}
