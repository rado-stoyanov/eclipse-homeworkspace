import java.util.Scanner;

public class Console {
	
	public static void log(String message) {
		System.out.println(message);
	}	
	
	public static void log(int message) {
		System.out.println(message);
	}	
	
	public static int promtInt(String message) {	
		Scanner input 		= new Scanner(System.in);
		System.out.print(message);
		return input.nextInt();
	}	
	
	public static String promtString(String message) {	
		Scanner input 		= new Scanner(System.in);
		System.out.print(message);
		return input.next();
	}	
	
	
	
	
	
	
}