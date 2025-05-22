package program;
import java.util.*;

public class ListOperations {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange"));
        List<String> linkedList = new LinkedList<>(arrayList);

        addElement(arrayList, "Grapes");
        addElement(linkedList, "Grapes");

        addElementAtIndex(arrayList, 1, "Mango");
        addElementAtIndex(linkedList, 1, "Mango");

        addMultipleElements(arrayList, Arrays.asList("Pineapple", "Peach"));
        addMultipleElements(linkedList, Arrays.asList("Pineapple", "Peach"));

        accessElement(arrayList, 2);
        accessElement(linkedList, 2);

        updateElement(arrayList, 0, "Cherry");
        updateElement(linkedList, 0, "Cherry");

        removeElement(arrayList, "Banana");
        removeElement(linkedList, "Banana");

        searchElement(arrayList, "Orange");
        searchElement(linkedList, "Orange");

        getListSize(arrayList);
        getListSize(linkedList);

        iterateList(arrayList);
        iterateList(linkedList);

        useIterator(arrayList);
        useIterator(linkedList);

        sortList(arrayList);
        sortList(linkedList);

        sublist(arrayList, 1, 3);
        sublist(linkedList, 1, 3);

        clearList(arrayList);
        clearList(linkedList);
    }

    static void addElement(List<String> list, String element) {
        list.add(element);
    }

    static void addElementAtIndex(List<String> list, int index, String element) {
        list.add(index, element);
    }

    static void addMultipleElements(List<String> list, List<String> elements) {
        list.addAll(elements);
    }

    static void accessElement(List<String> list, int index) {
        System.out.println(list.get(index));
    }

    static void updateElement(List<String> list, int index, String newElement) {
        list.set(index, newElement);
    }

    static void removeElement(List<String> list, String element) {
        list.remove(element);
    }

    static void searchElement(List<String> list, String element) {
        System.out.println(list.contains(element));
    }

    static void getListSize(List<String> list) {
        System.out.println(list.size());
    }

    static void iterateList(List<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }

    static void useIterator(List<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    static void sortList(List<String> list) {
        Collections.sort(list);
    }

    static void sublist(List<String> list, int start, int end) {
        System.out.println(list.subList(start, end));
    }

    static void clearList(List<String> list) {
        list.clear();
    }
}