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
			System.out.println("Option 3: Exit.");
			
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
			    default:
			    	break;
			}
			
		}while(userChoice != 3);
		
		
		
		
	}
}
  