package com.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternPerfTest {
	public static final Pattern pattern = Pattern.compile(" ");
	
	public void getPatternMatchesWithOutContant(){
		Pattern pattern = Pattern.compile(" ");
		Matcher matcher = pattern.matcher("123 2456 324324 4231");
		matcher.matches();
	}
	
	public void getPatternMatchesWithContant(){
		Matcher matcher = pattern.matcher("123 2456 324324 4231");
		matcher.matches();
	}
}
