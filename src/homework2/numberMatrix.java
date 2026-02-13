package homework2;
import java.util.Scanner;

public class numberMatrix {
	public static void main(String[] args){
		int[][] matrix = {{0, 1, 2}, {3, 4, 5}};
		
		int userChoice;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Option 1: Search Matrix.");
			System.out.println("Option 2: Sum Even Numbers.");
			System.out.println("Option 3: Exit program.");
			
			System.out.print("Enter your option number 1-3: ");
			userChoice = input.nextInt();
			input.close();
			
			switch (userChoice){
			    case 1:
			    	System.out.println("What number would you like to search for?");
			    	int userMatrix;
			    	Scanner matrixScan = new Scanner(System.in);
			    	System.out.print("Enter it here: ");
			    	userMatrix = matrixScan.nextInt();
			    	matrixScan.close();
			    	boolean found = false;
			    	mySearch:
			    	for (int a = 0; a < matrix.length; a++){
			    		for (int b = 0; b < matrix[0].length; b++){
			    			if (matrix[a][b] == userMatrix){found = true; break mySearch;}
			    		}
			    	}
			    	if (found == true){System.out.println("Found it!");}
			    	else {System.out.println("Number NOT found!");}
			    case 2:
			    	System.out.println("You have chosen to select the sum of all even numbers!");
			    	int userTotal = 0;
			    	for (int[] r : matrix){
			    		for (int c : r){
			    			if(c % 2 == 0){userTotal += c;}
			    		}
			    	}
			    	System.out.println("The total for all even numbers is " + userTotal + ".");
			    	break;
			    case 3:
			    	System.out.println("Exiting...");
			    	break;
			    default:
			    	System.out.println("Good Bye!");
			    	break;
			}
			
		}while(userChoice != 3);
		
		
		
		
	}
}
  