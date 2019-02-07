package com.archit;

public class Test {
	public static void main(String[] args) {
		int[] stockPrices = new int[]{2,32,12,34,5,21,6,7};
		
		getMaxDifference(stockPrices, 0, 0);
		
		
	}

	private static int getMaxDifference(int[] stockPrices, int location, int highestDifference) {
		if(stockPrices .length < location+1){
			return highestDifference;
		}
		if((stockPrices[location+1] - stockPrices[location]) > highestDifference){
		 highestDifference = stockPrices[location+1] - stockPrices[location]; 
		}
		return getMaxDifference(stockPrices, location, highestDifference);
	}
}