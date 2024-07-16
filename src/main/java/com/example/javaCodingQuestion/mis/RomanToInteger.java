package com.example.javaCodingQuestion.mis;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = scanner.nextLine();
		int romanToInteger = romanToInteger(str.replace(" ", "").toUpperCase());
		System.out.println("You entered year: " + romanToInteger);
		scanner.close();
	}
	public static int romanToInteger(String str) {
		Map<String,Integer> map = new HashMap<>();
		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);
		map.put("D", 500);
		map.put("M", 1000);
		int year=0;
		for (int i = 0; i <  str.length(); i++) {
			int currentValue=map.get(String.valueOf(str.charAt(i)));
			if(i+1<str.length()) {
				int nextValue=map.get(String.valueOf(str.charAt(i+1)));
				if(currentValue<nextValue) {
					year-=currentValue;
				}else {
					year+=currentValue;
				}
			}else {
				year+=currentValue;
			}
			
		}
		return year;
	}
}
