import java.util.LinkedList;
import java.util.Queue;

public class Queues {

  public static void main(String[] args) {

    Queue<String> queue = new LinkedList<String>();

    queue.offer("Joe");
    queue.offer("Cameron");
    queue.offer("Steve");

    System.out.println(queue);

  }
}
