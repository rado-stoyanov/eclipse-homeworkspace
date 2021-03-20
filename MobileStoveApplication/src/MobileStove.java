import java.util.Scanner;

public class MobileStove {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please, insert your serial ID number: ");
		int serialIdNumber = scanner.nextInt();

		ComponentsLogic.SerialIdUserConfigurationLogic(serialIdNumber);
		
		int vipOrNot = ComponentsLogic.EvenOrOddIdNumberLogic(serialIdNumber);		
		System.out.print(vipOrNot == 0 ? " You are VIP." : " You are not VIP.");
		
		int bonusMeal = ComponentsLogic.BonusMealLogic(serialIdNumber);		
		System.out.println(bonusMeal > 3 ? " Your can get bonus meal." : " You can not get bonus meal.");
			
		boolean isSuperSpecialVip = ComponentsLogic.SuperSpecialVipLogic(serialIdNumber);
		
		System.out.println(isSuperSpecialVip ? 
				"You are SUPER VIP and can get discount of price for all articles." : 
					"You can not get discount of price.");
		
		ComponentsLogic.MenuLogic();
		
		System.out.println(bonusMeal < 3 ? 
				ComponentsLogic.SingleOrderLogic() : 
					ComponentsLogic.DoubleOrderLogic(serialIdNumber));
	}

}
