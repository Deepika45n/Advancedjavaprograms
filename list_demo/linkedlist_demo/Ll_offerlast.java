//Write a Java program to insert the specified element at the end of a linked list.( using  l_listobj.offerLast("Pink")) 

package program;

import java.util.LinkedList;

public class Ll_offerlast {
	public static void main(String[] args) {
	LinkedList<String> colors = new LinkedList<>();
    colors.add("Red");
    colors.add("Green");
    colors.add("Blue");
    System.out.println("Original " + colors);
    colors.offerLast("Pink");
    System.out.println("after using method " + colors);
	}
}
