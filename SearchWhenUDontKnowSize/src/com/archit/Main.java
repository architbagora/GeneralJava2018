package com.archit;

public class Main {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		//search(arr, 6, 1);

		System.out.println(1002/1000);
	}

	private static void search(int[] arr, int item, int jump) {
		if (arr[jump] == item) {
			System.out.println("Found at " + jump);
			return;
		}
		try {
			if(arr[jump] < item){
				search( arr,item, jump+jump);
			} else{
				search( arr,item, (jump/2 + jump/4));
			}
		} catch (ArrayIndexOutOfBoundsException ex) {
			search( arr,item, jump/2);
		}
	}
}
