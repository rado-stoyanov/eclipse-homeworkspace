
public class PrintMethods {
	
	static final boolean TEMP_IS_FAHRENHEIT = true;
		
	public static void reverseNumberMethod () {		
		System.out.println("1. Reverse number application");
		int fourDigitNumber = ConsoleMethods.inputInt("Please insert four digit number: ");
		MethodLogics.firstInsertedDigitMethod(fourDigitNumber);		
	}
	
	public static void zeroToNonZeroMethod () {	
		System.out.println("2. Chek number is greater(number*10), lower(number/10) or equal(number-10) to 0 application");		
		double zeroOrNotZeroNumber = ConsoleMethods.inputDouble("Please insert number: ");
		double NumberChecked = MethodLogics.zeroNumberCheckerMethod(zeroOrNotZeroNumber);
		System.out.println("Your number is: " + NumberChecked);
	}
	
	public static void temperatureTypeMethod () {		
		System.out.println("3. Is temperature is Fahrenheit (type 1) or Celsius (every other type)");
		double typeNumber = ConsoleMethods.inputDouble("Please insert temperature type number: ");
		int tempNumber = ConsoleMethods.inputInt("Please insert temperature: ");
		boolean typeTemp = MethodLogics.typeOfTemp(typeNumber);
		
		if(typeTemp == TEMP_IS_FAHRENHEIT) {
			System.out.println("Temperature is: " + tempNumber + " Fahrenheit");
		}else {
			System.out.println("Temperature is: " + tempNumber + " Celsius");
		}		
	}
	
	public static void thirdDigitMethod () {	
		System.out.println("4. Chek what is 3th digit after decimal point application");
		double doubleNumber = ConsoleMethods.inputDouble("Please insert double number: ");	
		int thirdDigitAfterDecimalPoint = MethodLogics.thirdDigit(doubleNumber);
		System.out.println("Third digit after decimal point is: " + thirdDigitAfterDecimalPoint);
	}
	
	public static void isYearLeapMethod () {
		System.out.println("5. Is this year is high or not application");
		int yearHighOrNot = ConsoleMethods.inputInt("Please insert year: ");		
		int isYearLeap = MethodLogics.yearHighOrNot(yearHighOrNot);	
		System.out.println("isYearLeap: " + isYearLeap);
	}
	
	public static void isTriangleRealMethod () {		
		System.out.println("6. Is this triangle is real or not application");
		int firstTriangleAngle = ConsoleMethods.inputInt("Please insert first triangle angle: ");
		int secondTriangleAngle = ConsoleMethods.inputInt("Please insert second triangle angle: ");
		int thirdTriangleAngle = ConsoleMethods.inputInt("Please insert third triangle angle: ");		
		boolean isTriangle = MethodLogics.isThisTriangleIsReal(firstTriangleAngle, secondTriangleAngle, thirdTriangleAngle);	
		System.out.println("Is this triangle is real?: " + isTriangle);			
	}
	
	public static void replaceDigitPlaceMethod () {		
		System.out.println("7. Replace digit information application.");
		int firstDigit = ConsoleMethods.inputInt("Please insert first digit: ");
		int secondDigit = ConsoleMethods.inputInt("Please insert second digit: ");	
		int[] twoDigits = MethodLogics.replaceDigitInformation(firstDigit, secondDigit);
		System.out.println("First digit now is: " + twoDigits[0] + "\n" + "Second digit now is: " + twoDigits[1]);		
	}

}
