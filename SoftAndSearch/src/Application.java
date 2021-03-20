import java.util.Arrays;

public class Application {
	
								/*Bubble sort*/
	public static int[] bubbleSort(int[] collection) {
		
		boolean hasSwap = false;
	
		//Outer loop
		for(int outerIndex = 0 ; outerIndex < (collection.length - 1); outerIndex++) {
							
			int innerLoopLimit = (collection.length - outerIndex - 1);
			hasSwap = false;
			
			//Inner loop
			for(int innerIndex = 0 ; innerIndex < (innerLoopLimit) ; innerIndex++) {
				
				int firtstElement = collection[innerIndex];
				int secondElement = collection[innerIndex + 1];
				
				if(firtstElement > secondElement) {
						
					collection[innerIndex] = secondElement;
					collection[innerIndex + 1] = firtstElement;
					hasSwap = true;
				}	
			}
			if(hasSwap == false) {
				break;
			}
		}		
		return collection;
	}
	
	
									/*Selection sort*/
	public static int[] selectionSort(int[] collection) {
		
		//Outer loop
		for(int outerIndex = 0 ; outerIndex < collection.length - 1 ; outerIndex++) {
			
			int cuurentMinimalElement = outerIndex;
			
			//Inner loop
			for(int innerIndex = (outerIndex + 1) ; innerIndex < collection.length ; innerIndex++) {
				
				if(collection[innerIndex] < collection[cuurentMinimalElement]) {
					cuurentMinimalElement = innerIndex;
				}
			}		
			int minElement = collection[cuurentMinimalElement];
			collection[cuurentMinimalElement] = collection[outerIndex];
			collection[outerIndex] = minElement;
		}
		return collection;
	}
	
	
									/*Slow Search*/	
	public static int slowSearch(int[] collection, int element) {
		
		for(int i = 0 ; i < collection.length ; i ++) {
			if (collection[i] == element) {
				return i;
			}
		}
		return -1;
	}
	
									/*Binary Search*/
	public static int binarySearch(int[] collection, int element) {
		
		Arrays.sort(collection);
		
		int leftSideIndex  = 0;
		int rightSideIndex = collection.length - 1;
		
		while (leftSideIndex <= rightSideIndex) {
			
			int middleIndex  = (leftSideIndex + rightSideIndex) / 2;
			int pivotElement = collection[middleIndex];
			
			if(pivotElement == element) {
				return middleIndex;
			}
			
			if(pivotElement < element) {
				leftSideIndex = middleIndex + 1;
			}
			else {
				rightSideIndex = middleIndex - 1;
			}	
		}	
		return -1;
	}
	
	

	public static void main(String[] args) {
		
		int[] collection = {1,10,8,66,5,99};
		
		//int[] newcollection = bubbleSort(collection);
		
		//int[] newcollection = selectionSort(collection);
		int index = binarySearch(collection, 5);
		System.out.println("Index => " + index);
				
		/*For Official Production, Fast Sort Method !!!*/
		Arrays.sort(collection);		
		
		for (int i = 0 ; i < collection.length ; i++) {
			System.out.println(collection[i]);
		}	
	}
}


