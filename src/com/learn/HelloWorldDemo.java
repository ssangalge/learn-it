package com.learn;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Currency;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HelloWorldDemo {

	public static void main(String[] args) {


		String[][] data = {{"a","b","c"},{"a","b","c"}};
		List <String>result = Stream.of(data)  // Stream<String[]>
		          .flatMap(Stream::of)        // Stream<String>
		          //.toArray(String[]::new);    // [a, b, c, d, e, f]
		          .filter(x-> "a".equals(x))
		          .collect(Collectors.toList());

		  for (String s : result) {
		      System.out.println(s);
		  }
		
		
		
		
	}
	
//	public static void printToConsole(String[] arg)
//	{
//	
//		 System.out.println("Prev value"+ arg[1].toString());
//		 arg[1]="T";
//		 System.out.println("New value"+ arg[1].toString());
//		 
//				 
//	}  

}
