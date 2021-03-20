import java.util.*;

import util.Console;
import util.Util;

public class Application {
	
	public static void displayRobotMsg() {
		
		for(int i = 10 ; i > 0 ; i--) {
			
			String message = Util.isEven(i) ? ("I am a Robotttt" + i) : ("" + i);
			Console.log(message);
			
//			if(i % 2 == 0) {
//				System.out.println("I am a Robotttt" + i);
//			}
//			else {
//				System.out.println(i);
//			}
		}
		
	}
	
	public static boolean hasElectricity() {
		Random randumGenerator = new Random();
		int coeficientHigh = randumGenerator.nextInt();
		int coeficientLow = randumGenerator.nextInt();
		
		if(coeficientHigh > coeficientLow) return true; 			
		if (coeficientHigh < coeficientLow) return false;			
		return hasElectricity();		
	}
	
	
	
	public static void display() {
		
		Console.log("Enter number of pixels");
		Scanner scanner = new Scanner(System.in);
		int numberOfPixels = scanner.nextInt();
		
		if (BattlerStrategy.isHitSuccesful(numberOfPixels)) {
			BattlerStrategy.incrementSuccessHit();	
			displayRobotMsg();	
			}
			
		if(BattlerStrategy.hasBattery()) {
			display();
		}
		
		if(hasElectricity()) {
			BattlerStrategy.recharge();
			display();
		}
		
		System.out.print("No electricity the robot stop its movment !!!!");		
	}
	
	
	
	public static void main(String[] args) {
	
	System.out.println("Please identify the object infront of you:");
	System.out.println("[1] Wall ");	
	System.out.println("[2] Chair ");	
	System.out.println("[3] Nothing ");	
		
	Scanner scanner = new Scanner(System.in);	
	int obsticleIndex = scanner.nextInt();	
	
	System.out.print(Navigation.getDirection(obsticleIndex));
		

		

	}
}
