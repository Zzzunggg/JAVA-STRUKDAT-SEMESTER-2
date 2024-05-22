package Pertemuan2LinkedList.tugas2;

public class LinkedListStack {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(3);
        stack.push(5);
      
        stack.display();

        System.out.println("Top element is " + stack.peek());

        System.out.println(stack.pop() + " popped from stack");
        System.out.println(stack.pop() + " popped from stack");
        
        stack.display();
    }
}
