//Write a Java program to iterate a linked list in reverse order (using
//objlist.descendingIterator())

package program;

import java.util.Iterator;
import java.util.LinkedList;

public class Ll_descendingop {


    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        Iterator<String> iterator = colors.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}



