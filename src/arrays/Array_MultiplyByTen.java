package arrays;

public class Array_MultiplyByTen {
	 
	
	public static void main(String[] args) {
        int[] intArray = {5, 3, 6, 2, 1};//4
        //5 = 5*5*5
        for (int i = 0; i < intArray.length; i++) {//i=0,1,2
            intArray[i] = intArray[i] * 10;
        }

        //Print an array
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + ", ");
        }
    }
}
