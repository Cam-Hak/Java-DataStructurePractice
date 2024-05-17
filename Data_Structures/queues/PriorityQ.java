import java.util.*;

public class PriorityQ {

  public static void main(String args[]) {

    /* FIFO data structure */

    Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

    queue.offer(3.0);
    queue.offer(2.5);
    queue.offer(4.0);
    queue.offer(1.5);
    queue.offer(2.0);

    while (!queue.isEmpty()) {
      System.out.println(queue.poll());
    }
  }
}
