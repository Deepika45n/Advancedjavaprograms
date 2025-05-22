/*Q3. Write a Java Program for Reversing the characters in a string using user defined function
reverseString().*/
package ADJ3;


import java.util.Scanner;

public class SReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();
        
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
        
        scanner.close();
    }
  
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}