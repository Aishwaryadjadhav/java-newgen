package arrays;


//WAP to get multiplication of all elements from given array

public class Array_multiplication {

	public static void main(String[] args) {
		int[] array = {5, 3, 6, 2, 3, 7, 4, 8};

        int output = 1;//5*3*6*2*3

        for (int i = 0; i < array.length; i++) {//i=0,1,2,3,4,5
            output = output * array[i];
        }
        System.out.println("Multiplication is : " + output);


	}

}
