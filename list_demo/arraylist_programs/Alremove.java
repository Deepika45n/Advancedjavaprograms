//Write a java program for getting different colors through ArrayList interface and remove the  2nd element and color "Blue" from the ArrayList (using remove by index and remove by  object) 


package program;

import java.util.ArrayList;

public class Alremove {
	public static void main(String[] args) {
		ArrayList <String> list=new ArrayList<>();
		list.add("Red");
		list.add("blue");
		list.add("green");
		System.out.println("After adding elements: " + list);
		list.get(0);
		list.get(1);
		list.get(2);
		
		list.remove(2);
		list.remove("blue");
		System.out.println("After removing elements: " + list);
	}
}
