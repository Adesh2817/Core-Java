package com.tns.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample1 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile(".s");
		Matcher m=p.matcher("as");
		boolean bl=m.matches();
		System.out.println(bl);
		
		boolean b2=Pattern.compile(".s").matcher("as").matches();
		System.out.println(b2);

	}

}
