/*a. Develop a java program for performing various string operations with different string
handling functions directed as follows
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String
Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with
contains( ) and startsWith() and endsWith()*/
package String;
import java.util.Scanner;
public class String_handling_func {


	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a string: ");
	        String str = scanner.nextLine();

	        System.out.println("Length of String: " + str.length());
	        System.out.println("First Character: " + str.charAt(0));
	        System.out.println("Last Character: " + str.charAt(str.length() - 1));

	        System.out.print("Enter another string for comparison: ");
	        String anotherStr = scanner.nextLine();
	        System.out.println("Equal? " + str.equals(anotherStr));
	        System.out.println("Ignore Case Equal? " + str.equalsIgnoreCase(anotherStr));

	        System.out.print("Enter substring to search: ");
	        String searchStr = scanner.nextLine();
	        System.out.println("Index of substring: " + str.indexOf(searchStr));

	        System.out.println("Substring (0 to 3): " + str.substring(0, Math.min(3, str.length())));

	        System.out.println("Uppercase: " + str.toUpperCase());
	        System.out.println("Lowercase: " + str.toLowerCase());
	        System.out.println("Replace 'a' with '@': " + str.replace('a', '@'));

	        System.out.println("Trimmed String: " + str.trim());

	        System.out.print("Enter another string to concatenate: ");
	        String concatStr = scanner.nextLine();
	        System.out.println("Concatenated String: " + str.concat(concatStr));

	        System.out.println("Splitting by space: ");
	        String[] words = str.split(" ");
	        for (String word : words) {
	            System.out.println(word);
	        }

	        StringBuilder sb = new StringBuilder(str);
	        sb.append(" is modified.");
	        System.out.println("StringBuilder Example: " + sb.toString());

	        System.out.println(String.format("Formatted output: %s | Length: %d", str, str.length()));

	        System.out.print("Enter an email for validation: ");
	        String email = scanner.nextLine();
	        boolean isValidEmail = email.contains("@") && email.startsWith("user") && email.endsWith(".com");
	        System.out.println("Is Email Valid? " + isValidEmail);

	        scanner.close();
	    }
	}


