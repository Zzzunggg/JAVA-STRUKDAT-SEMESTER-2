package Pertemuan2LinkedList.tugas1;

public class LinkedListStack {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(5);
        stack.push(7);
        stack.push(9);
        stack.push(11);

        stack.display();

        System.out.println("Top element is " + stack.peek());

        System.out.println(stack.pop() + " popped from stack");
       


        stack.display();
    }
}
