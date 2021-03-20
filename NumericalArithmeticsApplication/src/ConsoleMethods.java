import java.util.Scanner;

public class ConsoleMethods {
		
	public static int inputInt(String msg) {	
		Scanner input = new Scanner(System.in);
		System.out.print(msg);
		return input.nextInt();
	}
	
	public static double inputDouble(String msg) {		
		Scanner input = new Scanner(System.in);
		System.out.print(msg);
		return input.nextDouble();
	}

}
