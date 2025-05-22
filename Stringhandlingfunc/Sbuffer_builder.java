/*Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
your answer which one is better.*/

package String;

public class Sbuffer_builder {
	
	    public static void main(String[] args) {
	        int iterations = 10000;
	        String text = "AIET";

	        long startTimeBuffer = System.nanoTime();
	        StringBuffer stringBuffer = new StringBuffer();
	        for (int i = 0; i < iterations; i++) {
	            stringBuffer.append(text);
	        }
	        long endTimeBuffer = System.nanoTime();
	        long durationBuffer = endTimeBuffer - startTimeBuffer;
	        System.out.println("StringBuffer execution time: " + durationBuffer + " nanoseconds");

	        long startTimeBuilder = System.nanoTime();
	        StringBuilder stringBuilder = new StringBuilder();
	        for (int i = 0; i < iterations; i++) {
	            stringBuilder.append(text);
	        }
	        long endTimeBuilder = System.nanoTime();
	        long durationBuilder = endTimeBuilder - startTimeBuilder;
	        System.out.println("StringBuilder execution time: " + durationBuilder + " nanoseconds");

	        if (durationBuffer > durationBuilder) {
	            System.out.println("StringBuilder is faster than StringBuffer.");
	        } else {
	            System.out.println("StringBuffer is faster than StringBuilder.");
	        }
	    }
	}


