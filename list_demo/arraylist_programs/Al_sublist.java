// Write a java program for getting different colors through ArrayList interface and extract the  elements 1st and 2nd from the ArrayList object by using SubList() 

package program;

import java.util.ArrayList;
import java.util.List;

public class Al_sublist {
	public static void main(String[] args) {
		ArrayList <String> list=new ArrayList<>();
		list.add("red");
		list.add("blue");
		list.add("green");
		System.out.println("Original " + list);
		List<String> subList = list.subList(0, 2);
		System.out.println("extract the  elements 1st and 2nd");
		
		System.out.println("Sublist (0-2): " + subList);
		
	}
}

