//Write a java program for getting different colors through ArrayList interface and sort them  using Collections.sort( ArrayListObj) 

package program;

import java.util.ArrayList;
import java.util.Collections;

public class Al_sort {
	public static void main(String[] args) {
		ArrayList <String> list=new ArrayList<>();
		list.add("red");
		list.add("blue");
		list.add("green");
	
		System.out.println("After adding elements: " + list);
		Collections.sort(list);
		System.out.println("After sorting elements: " + list);
	}
}
