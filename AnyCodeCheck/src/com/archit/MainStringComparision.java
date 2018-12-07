package com.archit;

import org.apache.commons.lang3.StringUtils;

public class MainStringComparision {
	public static void main(String[] args) {
		String requestedUrl = "http://localhost/api/v1/search-service/g/men-socks-red/N-cuyoD1nohq6";

		int index= 0; 
		long startTime = System.nanoTime();
		for(int i =0 ;i<10000;i++){
		 index = StringUtils.lastIndexOf(requestedUrl, "?");
		}
		System.out.println("LAst index of    : " + (System.nanoTime() - startTime ));

		
		boolean falg =false;
		long startTimeConstains = System.nanoTime();
		for(int i =0 ;i<10000;i++){
		 falg = StringUtils.contains(requestedUrl, "?");
		}
		System.out.println("Contains index of : " + (System.nanoTime() - startTimeConstains ));
		
		String trimmedRequestedUrl = StringUtils.substring(requestedUrl, StringUtils.lastIndexOf(requestedUrl, "/g/"),
				StringUtils.lastIndexOf(requestedUrl, "?"));

		System.out.println(trimmedRequestedUrl);

	}
}
