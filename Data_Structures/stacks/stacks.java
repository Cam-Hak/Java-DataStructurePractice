import java.util.Stack;

public class stacks {

  public static void main(String[] args) {

    /* LIFO (Last in first out) */

    Stack<String> stack = new Stack<String>();

    stack.push("Orioles");
    stack.push("Nationals");
    stack.push("Yankees");
    stack.push("Blue Jays");
    stack.push("Diamondbacks");

    System.out.println(stack.isEmpty()); // should return false

    stack.pop(); // removes top/most recent element from array

    System.out.println(stack);

    /******************************************************************/

    // you can stack a popped element into a var
    String teamName = stack.pop();

    // prints top element in stack
    System.out.println(stack.peek());

    // prints out the integer for stack position (-1 if not found in stack)
    System.out.println(stack.search("Orioles"));
  }

}
