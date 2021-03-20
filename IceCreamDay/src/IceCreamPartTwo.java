  
import java.util.Scanner;

public class IceCreamPartTwo {

	public static void main(String[] args) {
			
		final int numberOfBranches = 10;
		final int fixedIceCreamProductionTarget = 5000;
		
		System.out.println("Please, write your name.");
		Scanner scannerName = new Scanner(System.in);
		String yourNameHere = scannerName.nextLine();
		System.out.println("Hello " + yourNameHere);
		
		System.out.println("Please, write the ice-creams target quantity of production for today.");
		Scanner scannerIceCreams = new Scanner(System.in);
		int quantityOfProductionForToday = scannerIceCreams.nextInt();
		
		String todayQuantityProductionComparisonToFixedTargetProduction = (quantityOfProductionForToday > fixedIceCreamProductionTarget) ? 
										  "The ice-creams quantity of production for today is: " + quantityOfProductionForToday : 
								                  "Your targer is not good. Pleae, try again to insert daily target.";
		
		System.out.println(todayQuantityProductionComparisonToFixedTargetProduction);
		
		int quantityIceCreamsForEveryShop = quantityOfProductionForToday / numberOfBranches;
		System.out.println("For each of ten shops quantity ice-creams is: " + quantityIceCreamsForEveryShop);
		
		System.out.println("Please, write the ice-creams quantity of production from yesterday.");
		Scanner scannerIceCreamsFromYesterday = new Scanner(System.in);
		int quantityIceCreamsFromYesterday = scannerIceCreamsFromYesterday.nextInt();
		
		boolean isLowCapacity = quantityOfProductionForToday < quantityIceCreamsFromYesterday;
				
		String yesterdayToTodayQuantityComparison = isLowCapacity ? "Low capacity" : "Good job";
		System.out.println(yesterdayToTodayQuantityComparison + " for your production line.");	
	}
}