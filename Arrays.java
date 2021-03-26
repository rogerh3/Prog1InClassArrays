
import java.util.Scanner;
import java.util.Random; 

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//initiallize Scanner and Random
		Scanner keyboard = new Scanner(System.in);
		Random randomNumbers = new Random();
		
		//Create the array with a size of 5
		//Array indexes will be 0-4
		int[] scores = new int[5]; 
	//	int[] home = new int[5]; 
	//	int[] visitor = new int[5]; 
		
		//Computer indexes always start at 0
		scores [0] = 15;
		scores[1] = 20;
		scores[2] = 3;
		scores[3] = 17;
		scores[4] = 7; 
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println("Your value in index " + i + " is: " + scores[i] + ".");
		}
		
		int arraySize = 0;
		System.out.println("Give me the size of the array.");
		arraySize = keyboard.nextInt();
		int[] myNumbers = new int[arraySize]; 
		
		//populate with random numbers in a loop
		
		for(int i=0; i<arraySize; i++) {
			myNumbers[1] = randomNumbers.nextInt(100) + 1; 
			System.out.println("Your value in index " + i + " is: " + myNumbers[i] + "."); 
		}
	}
}
