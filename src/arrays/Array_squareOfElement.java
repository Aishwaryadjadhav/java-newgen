package arrays;

public class Array_squareOfElement {

	public static void main(String[] args) {
		   int[] intArray = {5, 3, 6, 2};//4

	        for (int i = 0; i < intArray.length; i++) {//i=0,1
	            intArray[i] = intArray[i] * intArray[i];
	        }

	        //Print an array
	        for (int i = 0; i < intArray.length; i++) {
	            System.out.print(intArray[i] + ", ");
	        }

	}

}
