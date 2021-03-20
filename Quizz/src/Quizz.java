//import java.util.Scanner;

public class Quizz {
	
    // comment - single line
    // Main method  classScreenPrinter
	public static void main(String[] args) { 

        // print message over the console
		System.out.println("Hello World");
        
        // Numeric data
        // String data
        
        int numberOfQuizzShowRounds = 4;
        
        int numberOfAssistentsUseThrowTheRounds = numberOfQuizzShowRounds;
        System.out.println(numberOfAssistentsUseThrowTheRounds);
        
        int numberOfQuestionInRoundOne = 10;
        System.out.println(numberOfQuestionInRoundOne);
        
        int numberOfQuestionInRound2 = 7;
        System.out.println(numberOfQuestionInRound2);
        
        int numberOfQuestionInRound3 = 5;
        System.out.println(numberOfQuestionInRound3);
        
        int numberOfQuestionInRoundFinal = 1;
        System.out.println(numberOfQuestionInRoundFinal);
        
        int playerScore = 0;
        System.out.println(playerScore);
        
        int grantPrize = 1_000_000_000;
        System.out.println(grantPrize);
        
        String mainTitle = "Quizz Show!";
        char titleOfTheShowFirstChar = 'Q';
        String subTitle = "Hello world!";
        String titleOfTheShow = mainTitle + " " + subTitle + " " + "in" + " " + numberOfQuizzShowRounds + " " + "rounds";
        
        System.out.println(titleOfTheShow);
        
        String likeANumber = "10";
        int realNumber = 10;
        
        //Concatination result math
        //int numberCalculationResult = likeANumber + realNumber; It's not used!!
        //System.out.println(likeANumber + realNumber);
        
        
        int isApplauseSignOnNumber = 1;
        char isApplauseSignOnInChar = 'Y';
        String isApplauseSignOnInString = "Yes";
        
        boolean isApplauseSignOnInBoolean = true;
        boolean hasAccessToTheAdminPanel = false;
        boolean doesUserAcceptCreditCards = true;
        
        String checkId = "П" + 45254 + "45";
        System.out.println(checkId);
        
        int allVisitorsOnMonday = 1000;
        int allVisitorsOnThuesday = 2000;
        
        int[] visitorsCollection = {allVisitorsOnMonday, allVisitorsOnThuesday, 3000, 500, 700};
        
        System.out.println(visitorsCollection[0]);
        
        double netPrice = 100_000.55578975;
        System.out.println(netPrice);
        
        //Matrix
       // Scanner reader = new Scanner(System.in); //създаване на нов обект
       // String myName = reader.nextLine(); // извикване на метод с връщан резултат
       // System.out.println("Hello " + myName);
        
        
        
        
        //Cammil Case
        //int numberOfQuizzShowRounds = 4;
        
        //Snake Case
        //int number_of_question_in_round_one = 10;
        
        //Pascal Case only in class names
        //int NumberOfQuestionInRound1 = 7;
        
        //Dash Case, not available in Java
        //int number-of-question-in-round-tree = 5;
        
        //Only used special characters in first place: _ and $
        //int _numberOfQuestionInRound3 = 5;
        //int $numberOfQuestionInRound3 = 5;
        
        //do not use reserved keywords as name
        //int int = 4;
        
        //////////////////////////////////////////////////////////////////
        
        System.out.println("///////////////////////////////////////////////////////////////");
        
        
        final int RATING_STELLAR = 5000;
        final int RATING_AVERAGE = 8000;
        final int RATING_GREAT = 10000;

        
        boolean isRatingOnMondayStellar = (allVisitorsOnMonday == RATING_STELLAR);
        
        isRatingOnMondayStellar = allVisitorsOnMonday < RATING_GREAT;
        boolean isRatingGreater = allVisitorsOnMonday < RATING_GREAT;
        boolean isRatingAverageOrGreat = allVisitorsOnMonday >= RATING_AVERAGE;
        
        //String ratingTitle = isRatingGreater ? "Rating is great" : "Rating is not ok";
        	
        String ratingTitle = (allVisitorsOnMonday < RATING_GREAT) ? "Rating is great" : "Rating is not ok";

        System.out.println(isRatingOnMondayStellar);
        System.out.println(ratingTitle);
        
        int stuffMemberCount = 20;
        int allVisitors = visitorsCollection[0] + visitorsCollection[1] + visitorsCollection[2] + visitorsCollection[3] - (stuffMemberCount * 5);
        
        final int HOST_COUNT = 1;
        
        //allVisitors = allVisitors - HOST_COUNT;
        
        allVisitors -= HOST_COUNT;
        
            
        System.out.println(allVisitors);
        
        int aritmeticWithEvenNumbers = 10 / 5;
        System.out.println(aritmeticWithEvenNumbers); 
        
        double aritmeticWithStrangeNumbers = 10.0 / 6.0;
        System.out.println(aritmeticWithStrangeNumbers); 
        
        double doubleOperant1 = 10;
        double doubleOperant2 = 6;
        System.out.println(doubleOperant1 / doubleOperant1);
        
        System.out.println(10 % 2);
        
        System.out.println("////////////////////////////////");
        
        //процедура - не връща стойност
        QuizzLogic.displayNumberOfQuestionsForTodayIndex(1);
        
        //функция - връща стойност
        int numberOfQuestionsForToday = QuizzLogic.getNumberOfQuestionsForToday(1, 500);
        System.out.println(numberOfQuestionsForToday);
        
        QuizzLogic.getNumberOfQuestionsForToday(1, 500);
        
        
        

        

	}
}

