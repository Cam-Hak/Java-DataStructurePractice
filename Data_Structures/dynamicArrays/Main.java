import java.util.*;

public class Main {
  public static void main(String args[]) {

    /* Testing Differences between dynamic arrays vs linked lists */

    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    ArrayList<Integer> arrayList = new ArrayList<Integer>();

    long startTime;
    long endTime;
    long elapsedTime;

    for (int i = 0; i < 1000000; i++) {
      linkedList.add(i);
      arrayList.add(i);
    }

    /* Linked List */
    startTime = System.nanoTime();

    // linkedList.get(0); slower
    // linkedList.get(500000); slower
    // linkedList.get(999999); slower
    // linkedList.remove(500000); slower
    // linkedList.remove(999999); slower

    // linkedList.remove(0); faster

    endTime = System.nanoTime();
    elapsedTime = endTime - startTime;

    System.out.println("LinkedList:\t" + elapsedTime + "ns");

    /* ArrayList */
    startTime = System.nanoTime();

    // arrayList.get(0); faster
    // arrayList.get(500000); faster
    // arrayList.get(999999); faster
    // arrayList.remove(500000); faster
    // arrayList.remove(999999); faster

    // arrayList.remove(0); slower

    endTime = System.nanoTime();
    elapsedTime = endTime - startTime;

    System.out.println("ArrayList:\t" + elapsedTime + "ns");

  }
}
