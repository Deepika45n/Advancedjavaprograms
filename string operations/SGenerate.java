/*Write a Java Program for Creating a random string of a specified length using user defined
function generateRandomString()*/
package ADJ3;
import java.util.Scanner;
import java.util.Random;

	public class SGenerate {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the length of the random string: ");
	        int length = scanner.nextInt();
	        
	        String randomString = generateRandomString(length);
	        System.out.println("Random string: " + randomString);
	        
	        scanner.close();
	    }
	    
	    public static String generateRandomString(int length) {
	        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        Random random = new Random();
	        StringBuilder randomString = new StringBuilder();
	        
	        for (int i = 0; i < length; i++) {
	            int index = random.nextInt(characters.length());
	            randomString.append(characters.charAt(index));
	        }
	        
	        return randomString.toString();
	    }
	}


