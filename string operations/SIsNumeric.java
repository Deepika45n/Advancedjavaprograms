
/*Write a Java Program for Verifying if a string contains only numeric characters using user defined
function isNumeric()*/
package ADJ3;
import java.util.Scanner;
public class SIsNumeric {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a string to check if it's numeric: ");
	        String input = scanner.nextLine();
	        
	        boolean isNumeric = isNumeric(input);
	        System.out.println("Contains only numeric characters? " + isNumeric);
	        
	        scanner.close();
	    }
	    
	    public static boolean isNumeric(String str) {
	        return str.matches("\\d+");
	    }
	}

