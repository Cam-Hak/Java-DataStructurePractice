import java.util.*;

public class LinkedListPrac {

  public static void main(String args[]) {

    LinkedList<String> linkedList = new LinkedList<String>();

    // can use .push or .offer methods to work like a stack or queue
    linkedList.offer("A");
    linkedList.offer("B");
    linkedList.offer("C");
    linkedList.offer("D");

    linkedList.add(4, "E");

    System.out.println(linkedList);

    /******************* Useful Methods ******************/
    // creates a new head node
    linkedList.addFirst("0");

    // creates a new tail node
    linkedList.addLast("F");

    System.out.println(linkedList.peekFirst());
    System.out.println(linkedList.peekLast());
    System.out.println(linkedList.removeFirst());
    System.out.println(linkedList.removeLast());
  }
}
