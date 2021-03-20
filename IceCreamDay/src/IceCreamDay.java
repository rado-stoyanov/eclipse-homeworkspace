import java.util.Scanner;

public class IceCreamDay {

	public static void main(String[] args) {		
		
		int numberOfProducedIceCreamsForDay = 1000;
		System.out.println("Produced icecreams for a day: " + numberOfProducedIceCreamsForDay);
				
		double iceCreamPrice = 2.50;
		System.out.println("Price for one icecream: " + iceCreamPrice);
				
		String iceCreamName = "EXTREME ICE CREAM";
		System.out.println("Icecream name: " + iceCreamName);
				
		boolean isIcecreamAssemblyLineOn = false;
		System.out.println("Is icecream assembly line is on: " + isIcecreamAssemblyLineOn);
				
		char iceCreamCharacterIdenfiticator = 'A';
		String iceCreamNumericalIdentificator = "7894";
		System.out.println("Ice Cream unique identification code: " + iceCreamCharacterIdenfiticator + iceCreamNumericalIdentificator);
				
		String[] iceCreamFlavors = {"white", "purple", "yellow", "green"};
		System.out.println("Choosen icecream flavor: " + iceCreamFlavors[0]);
				
        Scanner reader = new Scanner(System.in); 
        String fanName = reader.nextLine(); 
        System.out.println("Hello ice cream fan " + fanName + ". Get from ours new flavors.");		
	}
}
