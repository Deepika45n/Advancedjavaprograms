// Write a Java program to iterate through all elements in a linked list starting at the  specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1)) 

package program;
import java.util.*;
public class Ll_iterator {
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		ll.add("red");
		ll.add("blue");
		ll.add("green");
		System.out.println("Original " + ll);

		Iterator<String> iterator = ll.listIterator(1);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
		
	}
}
