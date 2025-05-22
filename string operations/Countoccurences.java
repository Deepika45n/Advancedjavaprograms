/*Q2. Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences()*/
package ADJ3;

public class Countoccurences {


	    
	    public static int countOccurrences(String mainString, String subString) {
	        if (mainString == null || subString == null || subString.isEmpty()) {
	            return 0;
	        }

	        int count = 0;
	        int index = 0;

	        while ((index = mainString.indexOf(subString, index)) != -1) {
	            count++;
	            index += subString.length();
	            }
	        return count;
	    }

	    public static void main(String[] args) {
	      
	        String mainString = "This is a test string. Testing the test code with test cases.";
	        String subString = "test";

	       
	        int result = countOccurrences(mainString, subString);
	        System.out.println("The substring \"" + subString + "\" appears " + result + " times in the main string.");
	    }
	}


