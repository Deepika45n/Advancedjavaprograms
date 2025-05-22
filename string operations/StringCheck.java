
/*Q1. Write a Java Program for Checking if a given string is null or contains only whitespace using user
defined function isNullOrEmpty().*/
package ADJ3;

public class StringCheck {
    public static void main(String[] args) {
        String str1 = null;
        String str2 = "   ";
        String str3 = "Hello";
        
        System.out.println("Is str1 null or empty? " + isNullOrEmpty(str1));
        System.out.println("Is str2 null or empty? " + isNullOrEmpty(str2));
        System.out.println("Is str3 null or empty? " + isNullOrEmpty(str3));
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
}