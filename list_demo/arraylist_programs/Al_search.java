// Write a java program for getting different colors through ArrayList interface and search whether the color "Red" is available or not  
//( Hint : Use ArrayListObj.contains() )  



package program;
import java.util.*;
public class Al_search {
	public static void main(String[] args) {
		ArrayList <String> list=new ArrayList<>();
		list.add("Red");
		list.add("blue");
		list.add("green");
		if(list.contains("Red")) {
			System.out.print("red is present");
		}
		else {
			System.out.print("red is absent");
		}
			
	}
	
	

}
