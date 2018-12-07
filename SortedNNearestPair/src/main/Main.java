package main;

import java.io.*;
import java.util.*;

public class Main {

	// Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
    	int minimumBribe = 0;
    	int lastSwiped = 0;
    	int chaosCheckCount= 1;
    	boolean chaos = false;
    	
    	for(int i = 0 ; i< q.length-1 ; i ++){
    		if(q[i]  > q[i +1]){
    			minimumBribe++;
    			if(lastSwiped == q[i]){
    				chaosCheckCount ++;
    			}
    			int temp = q[i];
    			q[i] = q[i+1];
    			q[i+1] = temp;
    			
    			lastSwiped = q[i+1];
    			if(chaosCheckCount > 2){
    				System.out.println("Too chaotic");
    				chaos = true;
    			}
    		}
    	}
    	if(!chaos){
    	System.out.println(minimumBribe);
    	}
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	minimumBribes( new int[]{2 ,5, 1, 3, 4});
    }
}
