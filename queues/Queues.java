import java.util.LinkedList;
import java.util.Queue;

public class Queues {

  public static void main(String[] args) {

    /* FIFO data structure */

    Queue<String> queue = new LinkedList<String>();

    /* .offer adds to the queue */
    queue.offer("Joe");
    queue.offer("Cameron");
    queue.offer("Steve");

    /* shows whatever is the first element in the queue */
    System.out.println(queue.peek());

    /* .poll takes away whatever is at the front of the queue */
    queue.poll();

    /************* Useful Methods *************/
    System.out.println(queue.isEmpty());
    System.out.println(queue.size());
    System.out.println(queue.contains("Cameron"));
  }
}
