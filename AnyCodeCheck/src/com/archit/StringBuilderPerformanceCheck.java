package com.archit;

public class StringBuilderPerformanceCheck {
	public static void main(String[] args) {
		String result = null;
		
		double start = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			result = result +Constants.PARENT_ID + Constants.PARENT_ID + Constants.PARENT_ID + Constants.PARENT_ID
					+ Constants.PARENT_ID + Constants.PARENT_ID;
		}
		System.out.println("TIME TAKE FOR CONCATENATION "+ (System.nanoTime() -start));

		start = System.nanoTime();
		StringBuilder sb =new StringBuilder();
		
		for (int i = 0; i < 10000; i++) {
			result = sb.append(Constants.PARENT_ID).append(Constants.PARENT_ID).append(Constants.PARENT_ID)
					.append(Constants.PARENT_ID).append(Constants.PARENT_ID).append(Constants.PARENT_ID).toString();
		}
		System.out.println("TIME TAKE FOR SB            "+ (System.nanoTime()-start));
		
	}
}
