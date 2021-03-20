import java.util.Scanner;

public class QuizzLogic {
	
	//Functionality
	//1. -> procedure (под програма) функционалности които не връщат стойности.
	// Вземете количеството на всички въпроси които ще бъдат зададени днес.
	public static void displayNumberOfQuestionsForTodayIndex(int indexOfTheDay) {
		Scanner scanner = new Scanner(System.in);
		
		int indexOffset = indexOfTheDay - 1;
		
		String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
		
		String todayIdentificator = daysOfTheWeek[indexOffset];
		System.out.println("Enter number of questions for "+ todayIdentificator + "? : ");
		int numberOfQuestions = scanner.nextInt();
		System.out.print("We have " + numberOfQuestions + " questions");
		
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//2. -> function функционалности които връщат стойност
	public static int getNumberOfQuestionsForToday(int dayIndex, int numberOfVisitors) {
		
		boolean isRatingLow = numberOfVisitors < 500;
		boolean isRatingMedium = (numberOfVisitors > 500 && numberOfVisitors < 1000);
		boolean isRatingHigh = numberOfVisitors > 1000;
		
		//boolean isSpecialPriceAvailable = isRatingMedium || isRatingHigh;
		
		//boolean isSpecialPriceAvailable = (isRatingLow == false);
		
		boolean isSpecialPriceAvailable = !isRatingLow;
		
		boolean isMonday = dayIndex == 0;
		boolean isFriday = dayIndex == 4;
		boolean isQuestionEasy = isRatingLow && isMonday;
		
		boolean isQuestionHard = isSpecialPriceAvailable;
		
		return isQuestionHard ? 
				(isFriday ? 
						12 
						: 
						15) 
				: 
				10;
		
		
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void displayNumberOfQuestionsForToday(int dayIndex, int numberOfVisitors) {
		
		String dayOfWeek = getDayOfWeek(dayIndex);
		int numberOfQuestions = getNumberOfQuestionsForToday(dayIndex, numberOfVisitors);
		System.out.print(numberOfQuestions);
		
		System.out.print(dayOfWeek);
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static String getDayOfWeek(int dayIndex) {
		
		int indexOffset = dayIndex - 1;
		
		String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
		
		String day = daysOfTheWeek[indexOffset];
		
		return day;
	}

}
