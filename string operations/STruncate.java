/*Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()*/
package ADJ3;
import java.util.Scanner;
public class STruncate {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a string to truncate: ");
	        String input = scanner.nextLine();
	        
	        System.out.print("Enter the maximum length: ");
	        int length = scanner.nextInt();
	        
	        String result = truncate(input, length);
	        System.out.println("Truncated string: " + result);
	        
	        scanner.close();
	    }
	    
	    public static String truncate(String str, int maxLength) {
	        if (str.length() > maxLength) {
	            return str.substring(0, maxLength) + "...";
	        } else {
	            return str;
	        }
	    }
	}
	

