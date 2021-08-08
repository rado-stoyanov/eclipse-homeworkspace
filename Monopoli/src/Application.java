public class Application {

	public static void main(String[] args) {

		String[] myArray = {"FALSESUCCESS", "TRUE", "MY", "SUCCESS", "BULGARIA", "SUCCESS"};

		for(int i = 0; i < myArray.length ; i++){
			
			if(myArray[i] == "SUCCESS") {
				System.out.println(i);
			}

		}	
	}
}
