import java.util.Scanner;

public class ConsoleMethods {
	
	public static int input(String msg) {	
		Scanner input = new Scanner(System.in);
		System.out.print(msg);
		return input.nextInt();
	}
	
	public static void print(String msg) {
		System.out.println(msg);
	}
	
	public static void print(int msg) {
		System.out.println(msg);
	}

}
