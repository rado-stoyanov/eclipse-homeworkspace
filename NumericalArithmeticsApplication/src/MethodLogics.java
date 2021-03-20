
public class MethodLogics {
	
	static final int DIVISION_COEFICIENT = 10;
	static final int MODULE_DIVISION_COEFICIENT = 10;	
	static final int THOUSANDS_COEFICIENT = 1000;
	static final int HUNDRED_COEFICIENT = 100;
	static final int TEN_COEFICIENT = 10;	
	static final int WRONG_DIGIT_COEFICIENT = 0;
	static final int FAHRENHEIT_COEFICIENT = 1;
	static final int ZERO_COEFICIENT = 0;
			
	public static int reverseMethod (int firstNumber) {
				
		if (firstNumber >= 1000 && firstNumber <= 9999) {
			
			int firstReversedDigit = ((firstNumber % MODULE_DIVISION_COEFICIENT) * THOUSANDS_COEFICIENT);		
			int afterFirstDivision = firstNumber / DIVISION_COEFICIENT;		
			int secondReversedDigit = ((afterFirstDivision % MODULE_DIVISION_COEFICIENT) * HUNDRED_COEFICIENT);		
			int afterSecondDivision = afterFirstDivision / DIVISION_COEFICIENT;		
			int thirdReversedDigit = ((afterSecondDivision % MODULE_DIVISION_COEFICIENT) * TEN_COEFICIENT);		
			int fourReversedDigit = afterSecondDivision / DIVISION_COEFICIENT;	
			
			int reversedDigit = firstReversedDigit + secondReversedDigit + thirdReversedDigit + fourReversedDigit;
			
			return reversedDigit;
		}else {
			return WRONG_DIGIT_COEFICIENT;
		}		
	}
	
	public static boolean insertedDigitVersusReversed (int firstNumber, int reversedNumber) {
	
		return firstNumber > reversedNumber;	
	}
		
	public static void firstInsertedDigitMethod (int firstNumber) {
		
		int reversedFourDigitNumber = reverseMethod(firstNumber);
		
		boolean isInsertedDigitGreaterThanReversed = insertedDigitVersusReversed(firstNumber, reversedFourDigitNumber);
		
		if (reversedFourDigitNumber != ZERO_COEFICIENT) {
			System.out.println("Reversed number is: " + reversedFourDigitNumber);		
			if (isInsertedDigitGreaterThanReversed == true) {
				System.out.println("Greater number is: " + firstNumber);
			}else {
				System.out.println("Greater number is: " + reversedFourDigitNumber);
			}			
		}else {
			System.out.println("Your number is out of application range! Please try again.");
		}		
	}
		
	public static double zeroNumberCheckerMethod (double secondNumber) {
		
		double zeroNumberChecker = ZERO_COEFICIENT;
		
		if(secondNumber > ZERO_COEFICIENT) {
			zeroNumberChecker = (secondNumber * TEN_COEFICIENT);
		}else if(secondNumber < ZERO_COEFICIENT) {
			zeroNumberChecker = (secondNumber / TEN_COEFICIENT);
		}else {
			zeroNumberChecker = (secondNumber - TEN_COEFICIENT);
		}
			
		return zeroNumberChecker;	
	}
		
	public static boolean typeOfTemp (double typeTempNumber) {
		
		return (typeTempNumber == FAHRENHEIT_COEFICIENT ? true : false);		
	}
	
	public static int thirdDigit (double thirdNumber) {
		
		int thirdDigitAfterDecimalPoint = (int) ((thirdNumber * THOUSANDS_COEFICIENT) % TEN_COEFICIENT);		
		
		return thirdDigitAfterDecimalPoint;	
	}
		
	public static int yearHighOrNot (int yearNumber) {
		
		if ((yearNumber % 4 == 0) && (yearNumber % 100 != 0)) {
			return yearNumber;
		}else {
			return -1;
		}	
	}
		
	public static boolean isThisTriangleIsReal (int firstAngle, int secondAngle, int thirdAngle) {
		
		int sumOfThreeAngles = firstAngle + secondAngle + thirdAngle;
		
		if (sumOfThreeAngles == 180) {
			return true;
		}else {
			return false;
		}	
	}
		
	public static int[] replaceDigitInformation (int firstDigit, int secondDigit) {
		
		int[] twoDigits = new int[2];
		
		twoDigits[0] = firstDigit + (secondDigit - firstDigit);
		twoDigits[1] = secondDigit + (firstDigit - secondDigit);
			
		return twoDigits;		
	}
	
}
