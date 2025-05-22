package ADJ3;


	public class StringChecker {

	    
	    public static boolean isNullOrEmpty(String str) {
	        return str == null || str.trim().isEmpty();
	    }

	    public static void main(String[] args) {
	        String[] testStrings = {null, "", "   ", "Hello", "  World  "};

	        for (String test : testStrings) {
	            System.out.println("Input: " + test + " -> " + 
	                               (isNullOrEmpty(test) ? "Null/Empty or Whitespace" : "Valid String"));
	        }
	    }
	}

