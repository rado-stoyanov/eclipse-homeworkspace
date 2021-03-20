import java.util.Scanner;

public class ComponentsLogic {
	
	public static void SerialIdUserConfigurationLogic(int idNumber) {
		
		boolean isMoreThanTwoNumbers = (idNumber >= 100) && (idNumber <= 99999);
		boolean isMoreThanSixNumbers = idNumber > 999999;
		boolean isSixNumbers = (idNumber >= 100000) && (idNumber <= 999999);

		System.out.print(isMoreThanTwoNumbers ? "Your rank is EARLY ADOPTER user." : 
						  (isMoreThanSixNumbers ? "Your rank is LAGGER user." : 
						  (isSixNumbers ? "Your rank is NORMAL user." : 
						  "This is INVALID user.")));
	}
	

	
	public static int EvenOrOddIdNumberLogic (int idNumber) {
		
		int evenOrOddParameter = (idNumber % 10) %2;
		
		return evenOrOddParameter;		
	}
	

	
	public static int BonusMealLogic (int idNumber) {
			
		int bonusMealParameter = (idNumber / 10) % 10;	
		
		return bonusMealParameter;
	}
	

	
	public static boolean SuperSpecialVipLogic (int idNumber) {
		
		int vipOfNot = EvenOrOddIdNumberLogic(idNumber);
		int bonusMeal = BonusMealLogic(idNumber);
		
		boolean superVipStatus = vipOfNot == 0 && bonusMeal > 3;
			
		return superVipStatus;
	}
	

	
	public static void MenuLogic() {
	Scanner scanner = new Scanner(System.in);
	
	final String[] allMenuForOrder = {"Menu one [5 lv.]", "Menu two [3 lv.]", "Menu three [9 lv.]", "Menu four [6 lv.]"};
	
	final int[] allMenuForOrderWithPrices = {5, 3, 9, 6};
	
	System.out.print("MENU: ");
	System.out.println("1. " + allMenuForOrder[0] + "; 2. " + allMenuForOrder[1] + "; 3. " + allMenuForOrder[2] + "; 4. " + allMenuForOrder[3] + ";");	
}
	
	
	
	public static String SingleOrderLogic() {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Please, insert menu you want: ");		
	final int idOrder = scanner.nextInt();
	
	final String[] allMenuForOrder = {"Menu one", "Menu two", "Menu three", "Menu four"};	
	final int[] allMenuForOrderWithPrices = {5, 3, 9, 6};

	String orderedMenu = allMenuForOrder[idOrder-1];
	int priceForOrderedMenu = allMenuForOrderWithPrices[idOrder-1];
	
	boolean checkMenu = idOrder >= 0 && idOrder <= 4;
	
	String choosenMenu = (checkMenu ? 
							("Your order is " + orderedMenu + " : " + priceForOrderedMenu + " lv.")  : 
								"You do not choose menu you want. Price for this is 1 lv.");
	
	return choosenMenu;	
}
	
	
	public static String DoubleOrderLogic(int idNumber) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Please, insert menu you want: ");	
	final int firstIdOrder = scanner.nextInt();
	
	System.out.print("Please, insert bonus menu you want: ");	
	final int secondIdOrder = scanner.nextInt();
	
	final String[] allMenuForOrder = {"Menu one", "Menu two", "Menu three", "Menu four"};	
	final int[] allMenuForOrderWithPrices = {5, 3, 9, 6};

	String firstOrderedMenu = allMenuForOrder[firstIdOrder-1];
	int firstPriceForOrderedMenu = allMenuForOrderWithPrices[firstIdOrder-1];
	
	String secondOrderedMenu = allMenuForOrder[secondIdOrder-1];
	int secondPriceForOrderedMenu = allMenuForOrderWithPrices[secondIdOrder-1];
	
	boolean firstCheckMenu = firstIdOrder >= 0 && firstIdOrder <= 4;
	boolean secondCheckMenu = secondIdOrder >= 0 && secondIdOrder <= 4;
	
	boolean isSuperVipUser = SuperSpecialVipLogic(idNumber);
	
	
	String firstChoosenMenuwholeOrderWithoutDiscount = (firstCheckMenu ? 
															("Your order is " + firstOrderedMenu + " : " + firstPriceForOrderedMenu + " lv. ")  : 
																"You do not choose menu you want. Price for this is 1 lv. ");
		
	String secondChoosenMenuwholeOrderWithoutDiscount = (secondCheckMenu ? 
															("Your bonus order is " + secondOrderedMenu + " : " + secondPriceForOrderedMenu + " lv.")  : 
																"You do not choose bonus menu you want. Price for this is 1 lv. ");
	
	String wholeOrderWithoutDiscount = firstChoosenMenuwholeOrderWithoutDiscount + " " + secondChoosenMenuwholeOrderWithoutDiscount;
	
	
	String firstChoosenMenuwholeOrderWithDiscount = (firstCheckMenu ? 
														("Your order is " + firstOrderedMenu + " : " + (firstPriceForOrderedMenu-1) + " lv. ")  : 
															"You do not choose menu you want. Price for this is 1 lv. ");

	String secondChoosenMenuwholeOrderWithDiscount = (secondCheckMenu ? 
															("Your bonus order is " + secondOrderedMenu + " : " + (secondPriceForOrderedMenu-1) + " lv.")  : 
																"You do not choose bonus menu you want. Price for this is 1 lv. ");

	String wholeOrderWithDiscount = firstChoosenMenuwholeOrderWithDiscount + " " + secondChoosenMenuwholeOrderWithDiscount;	
	
	String wholeOrder = (isSuperVipUser ? wholeOrderWithDiscount : wholeOrderWithoutDiscount);
	
	return wholeOrder;	
}
	
	
}
