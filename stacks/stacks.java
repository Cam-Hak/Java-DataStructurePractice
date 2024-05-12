import java.util.Stack;

public class stacks {

  public static void main(String[] args) {
    Stack<String> stack = new Stack<String>();
    stack.add("cameron");
    stack.add("hakenson");

    System.out.println(stack.toString());

    stack.pop();

    System.out.println(stack.toString());
  }

}
