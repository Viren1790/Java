package Day19;

public class Algorithms {

	public static void main(String[] args) {

		//From largest from array

		        int arr[] = {1,2,3,4,5};
		        int largest = arr[0];

		        for (int i=0; i<arr.length; i++) {

		            if (arr[i] > largest) {
		                largest = arr[i];
		            }
		        }

		        System.out.println("largest number is:"+largest);
		    }
		
	
}
