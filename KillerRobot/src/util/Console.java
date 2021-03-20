package util;

import java.util.Scanner;

public class Console {

	public static void log(String msg) {
		System.out.println(msg);
	}
	
	public static int promtInt(String msg) {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
}
