public class Main {
  public static void main(String args[]) {

    dynamicArrayPrac dynamicArray = new dynamicArrayPrac();

    dynamicArray.add("A");
    dynamicArray.add("B");
    dynamicArray.add("C");
    dynamicArray.insert(0, "x");
    dynamicArray.delete("A");

    System.out.println(dynamicArray);
    System.out.println("size: " + dynamicArray.size);
    System.out.println("capacity: " + dynamicArray.capacity);
    System.out.println("empty: " + dynamicArray.isEmpty());
  }
}
