/*Write a Java Program for Capitalizing the first letter of each word. using user defined function
capitalizeWords()*/
package ADJ3;
import java.util.Scanner;
public class SCapatilize {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a string to capitalize each word: ");
	        String input = scanner.nextLine();
	        
	        String result = capitalizeWords(input);
	        System.out.println("Capitalized string: " + result);
	        
	        scanner.close();
	    }
	    
	    public static String capitalizeWords(String str) {
	        String[] words = str.split("\\s+");
	        StringBuilder capitalized = new StringBuilder();
	        
	        for (String word : words) {
	            capitalized.append(Character.toUpperCase(word.charAt(0)))
	                       .append(word.substring(1).toLowerCase()).append(" ");
	        }
	        
	        return capitalized.toString().trim();
	    }
	}

