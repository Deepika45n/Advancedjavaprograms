//Write a Java program to display elements and their positions in a linked list ( using l_listobj.get(p) ) 

package program;

import java.util.LinkedList;

public class Ll_get {
	public static void main(String[] args) {
		LinkedList<String> colors = new LinkedList<>();
	    colors.add("Red");
	    colors.add("Green");
	    colors.add("Blue");
	    System.out.println("Original " + colors);
	   for(int i=0;i<colors.size();i++) {
		  	
	    System.out.print(i + "," + colors.get(i));
	    System.out.println();
	
	}	
	}
}
