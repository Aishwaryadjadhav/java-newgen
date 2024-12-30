package arrays;

public class Array_largest_element {

	public static void main(String[] args) {
		
	        int[] intArray = {5, 3, 6, 2, 1, 9};

	        int max = intArray[0];
	        for (int i = 1; i < intArray.length; i++) {

	            if (intArray[i] > max) {
	                max = intArray[i];
	            }
	        }
	        System.out.println("Largest number is : " + max);
	    }

	

}
