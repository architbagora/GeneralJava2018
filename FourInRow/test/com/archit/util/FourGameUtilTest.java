package com.archit.util;

import org.junit.Test;

import com.archit.model.ChipDefination;

public class FourGameUtilTest {

	@Test
	public void testCheckIfSomeoneWinning(){
		
		FourGameUtil.checkIfSomeoneWinning(getMeWinningMetrix());
		
	}
	
	
	
	
	private ChipDefination[][] getMeWinningMetrix(){
		ChipDefination[][]  chipDef =  new ChipDefination[7][7];
		/**
		 * || || || || || || || ||
		 * || || || || || || || ||
		 * || || || || || || || ||
		 * || || || || || || || ||
		 * || || || || || || || ||
		 * || || || || || || || ||
		 * || || || || || || || ||
		 * || ||A||B||B||B||B||A||
		 */
		
		chipDef[7][2] = ChipDefination.
		
		
		return null;
	}
	
}
