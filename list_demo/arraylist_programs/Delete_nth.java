// Write a java program for getting different colors through ArrayList interface and delete nth  element from the ArrayList object by using remove by index 

package program;

import java.util.ArrayList;
import java.util.Scanner;

public class Delete_nth {
	public static void main(String[] args) {
	ArrayList <String> list=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	list.add("red");
	list.add("blue");
	list.add("green");
	System.out.println("Original " + list);
	list.remove(n);
	
	System.out.println("After rempving " + list);
	}
}
