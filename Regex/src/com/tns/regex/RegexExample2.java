package com.tns.regex;

import java.util.regex.Pattern;

public class RegexExample2 {

	public static void main(String[] args) {
		System.out.println(Pattern.matches(".s", "as"));
		System.out.println(Pattern.matches(".s", "as"));
		
		System.out.println(Pattern.matches(".s", "ab"));
		System.out.println(Pattern.matches(".s", "as"));
		System.out.println(Pattern.matches(".s", "af"));
		

	}

}
