package arrays;

public class Array_Smallest_element {

	public static void main(String[] args) {
	
		int[] intArray = {5, 3, 6, 2, 1, 9};

        int min = intArray[0]; //5
        for (int i = 1; i < intArray.length; i++) {

            if (intArray[i] < min) {
                min = intArray[i];
            }
        }
        System.out.println("Largest number is : " + min);
    }


	

}
