package com.main;

import com.archit.BIke;
import com.archit.Car;
import com.archit.Vehical;

public class Main {

	
	public static void main(String[] args) {
		
		/*Vehical vehical = new Vehical();
		vehical.print("DHANA");
		
		Vehical vehical2 = new Car();
		vehical2.print();
		vehical2.print("DHANA");*/
		String str = "aaa|bbbb|ggggg";
		String[] str1 = str.split("[|]");
		
		System.out.println(str1.length);
		
		Vehical vehical3 = new Car();
		vehical3.print();

		
		
		
	}
}
