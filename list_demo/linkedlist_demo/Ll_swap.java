package program;
//. Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using Collections.swap(l_list, 0, 2)) 

import java.util.Collections;
import java.util.LinkedList;

public class Ll_swap {
	public static void main(String[] args) {
		LinkedList<String> colors = new LinkedList<>();
	    colors.add("Red");
	    colors.add("Green");
	    colors.add("Blue");
	    System.out.println("Original " + colors);
	    Collections.swap(colors, 0, 2);
	    System.out.println("afterSwap " + colors);
	    
	}

}
