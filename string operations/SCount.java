/*Write a Java Program for Counting the number of words in a string using user defined function
countWords()*/
package ADJ3;
import java.util.Scanner;
public class SCount {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a string to count its words: ");
	        String input = scanner.nextLine();
	        
	        int wordCount = countWords(input);
	        System.out.println("Number of words: " + wordCount);
	        
	        scanner.close();
	    }
	    
	    public static int countWords(String str) {
	        String[] words = str.trim().split("\\s+");
	        return words.length;
	    }
	}

