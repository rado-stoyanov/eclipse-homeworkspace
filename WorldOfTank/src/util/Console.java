package util;

import java.util.Scanner;

public class Console {
	
	
	public static void log(String element) {
		System.out.print(element);
	}
	
	public static void log(char element) {
		System.out.print(String.valueOf(element));
	}
	
	public static void log(boolean element) {
		System.out.print(String.valueOf(element));
	}
	
	public static void lognl(String element) {
		System.out.println(element);
	}

	public static void clear() {
		
		for(int row = 0; row < 15; row++) {
			lognl("");
		}
	}
	
	public static String input() {
	
		@SuppressWarnings("resource")
		Scanner scannerInput = new Scanner(System.in);
		return scannerInput.next();
	}
	
	public static int inputInt() {
		
		@SuppressWarnings("resource")
		Scanner scannerInput = new Scanner(System.in);
		return scannerInput.nextInt();
	}
	
	public static String input(String line) {
		
		@SuppressWarnings("resource")
		Scanner scannerInput = new Scanner(System.in);
		lognl(line);
		return scannerInput.next();
	}
	
	public static int inputInt(String line) {
		
		@SuppressWarnings("resource")
		Scanner scannerInput = new Scanner(System.in);
		lognl(line);
		return scannerInput.nextInt();
	}
	
	
	
	
	
	
}
