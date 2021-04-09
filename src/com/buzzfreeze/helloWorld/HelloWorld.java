package com.buzzfreeze.helloWorld;

import java.util.Iterator;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");

		// homework 2.1
		homework2_1();
		// homework 2.2
		bark();
		homework2_2();
		// homework 2.3
		homework2_3();
		// homework 3
		homework3();
		// homework 4
		homework4_1();
		homework4_3();
		homework6();
		homework7();
		homework8();
		homework9();
		homework10();

		returnMethod();
		noReturnMethod();

	}

	public static void homework2_1() {
		// homework 2.1
		// 2.1.1 comment
		/*
		 * Multiple Line
		 */
		// Single Line

		// 2.1.2 ประกาศตัวแปร
		int a = 0;
		boolean b = true;
		String hi = "Hi";
		float c = 1.25f;
		char d = 'a';
		// 2.1.3 print ตัวแปร
		System.out.println("-------------homework 2.1-------------");
		System.out.println("This is a int " + a);
		System.out.println("This is a boolean " + b);
		System.out.println("This is a String " + hi);
		System.out.println("This is a float " + c);
		System.out.println("This is a char " + d);
		System.out.println("");
	}

	public static void homework2_2() {
		// 2.2.2
		int a = 0;
		double b = 10d;
		float c = 1.25f;
		char d = 'a';

		int floatToInt = (int) c;
		float IntToFloat = a;
		float doubleToFloat = (float) b;
		int charToInt = d;

		System.out.println("Float To Int " + floatToInt);
		System.out.println("Int To Float " + IntToFloat);
		System.out.println("Double To Float " + doubleToFloat);
		System.out.println("Char To Int " + charToInt);
		System.out.println("");

	}

	// 2.2.1
	public static void bark() {
		String dogName = "Ricky";
		System.out.println("-------------homework 2.2-------------");
		System.out.println("The Dog name = " + dogName + " bark");
		System.out.println("");
	}

	public static void homework2_3() {
		final String hello = "Hello";
		// hello = "world"; // ไม่สามารถแก้ไขได้ eclipse ขึ้นข้อความ "The final local
		// variable hello cannot be assigned. It must be blank and not using a compound
		// assignment"
	}

	public static void homework3() {
		System.out.println("-------------homework 3-------------");
		int i = 20;
		i++;
		i++;
		i++;
		i++;
		i++;
		System.out.println("I is " + i);

		--i;
		--i;
		--i;
		--i;
		--i;
		--i;
		System.out.println("I is " + i);

		float score = 50.1f;
		String grade = null;
		if (score >= 50 && score <= 60) {
			grade = "D";
		}
		System.out.println("Grade = " + grade);

		char c1 = 'h';
		if (c1 != i || c1 != 'H') {
			System.out.println("c1 = " + c1);
		}
	}

	public static void homework4_1() {
		int score = 20;
		String grade = null;
		boolean isHandSome = true;

		if (!isHandSome) {
			if (score >= 80) {
				grade = "Good";
			} else if (score >= 50 && score < 80) {
				grade = "normal";
			} else if (score < 50) {
				grade = "fail";
			}
		} else {
			grade = "Good";
		}
		System.out.println("-------------homework 4.1-------------");
		System.out.println("Grade is " + grade);
	}

	public static void homework4_3() {
		int score = 20;
		String grade = null;

		switch (score) {
		case 80:
			grade = "A";
			break;
		case 70:
			grade = "B";
			break;
		case 60:
			grade = "C";
			break;
		case 50:
			grade = "D";
			break;
		case 40:
			grade = "F";
			break;
		default:
			grade = "E";
			break;
		}
		System.out.println("-------------homework 4.3-------------");
		System.out.println("Grade is " + grade);
	}

	public static void homework6() {
		System.out.println("-------------homework 6-------------");
		int i = 1;
		while (i <= 10) {

			System.out.println("I is " + i);
			i++;
		}

		sum();
		mod();
		printArray();
	}

	public static void sum() {
		System.out.println("-------------sum-------------");
		int i = 1;
		int sum = 0;
		while (i <= 10) {

			sum = sum + i;
			i++;
		}
		System.out.println("Sum is " + sum);
	}

	public static void mod() {
		System.out.println("-------------mod-------------");
		int i = 1;
		int mod = 12;
		System.out.println("เลขต่อไปนี้ระหว่าง 1-100 หาร 12 ลงตัว");
		while (i <= 100) {

			if (i % mod == 0) {
				System.out.println(i);
			}

			i++;
		}

	}

	public static void printArray() {
		System.out.println("Print Array");
		int arr[] = { 1, 2, 3, 4, 5 };
		for (int i : arr) {
			System.out.println(i);
		}
	}

	public static void homework7() {
		System.out.println("-------------homework 7-------------");
		int i = 20;
		do {
			System.out.println(i);

			i--;
		} while (i > 0 && (i % 2 == 0));// พอเลขเป็น 19 จะไม่ลูปต่อเพราะเป็นเลขคี่
	}

	public static void homework8() {
		int count = 20;
		System.out.println("-------------homework 8-------------");
		for (int i = 1; i <= count; i++) {
			if (i == 11) {
				System.out.println("I is " + i + " break");
				break;
			}
			System.out.println("I is " + i + " next-->");

		}

	}

	public static void homework9() {
		int count = 20;
		System.out.println("-------------homework 9-------------");
		for (int i = 1; i <= count; i++) {
			if (i == 11) {
				System.out.println("I is " + i + " continue");
				continue;
			}
			System.out.println("I is " + i + " next-->");

		}

	}

	public static void homework10() {
		int count = 10;
		System.out.println("-------------homework 10-------------");
		for (int i = 1; i <= count; i++) {

			if (i == 2) {
				continue;
			}
			System.out.println("I is " + i + " next");

		}

	}

	public static String returnMethod() {
		return "Return";
	}

	public static void noReturnMethod() {
		System.out.println("No return");
	}
}
