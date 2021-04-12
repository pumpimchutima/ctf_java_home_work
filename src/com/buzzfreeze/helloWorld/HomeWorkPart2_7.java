package com.buzzfreeze.helloWorld;

public class HomeWorkPart2_7 {
	

	public static void main(String[] args) {
		
		String string1 = "You and Me";
		String string2 = " you and me ";
		
		if(string1.equals(string2)) {
			System.out.println("string1 equals string2");
		}else {
			System.out.println("string1 not equals string2");
		}
		
		if(string1.contains("You")) {
			System.out.println("string1 has word you");
		}
		
		System.out.println("the length of string1 is "+string1.length());
		
		System.out.println("Substring 1 - 4 : "+string1.substring(0,1)+string1.substring(5,string1.length()));
		
		System.out.println("Trim :"+string2.trim());
		
		System.out.println("Upper case :"+string2.toUpperCase());
		
		System.out.println("Upper case and trim :"+string2.toUpperCase().trim());
		
	}

}
