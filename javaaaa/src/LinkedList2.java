import java.util.Stack;

class MyStack<T> extends Stack<T> {
    public void display() {
        System.out.println("Stack elements: " + this);
    }
}

public class LinkedList2 {
    public static void main(String[] args) {
        MyStack<Integer> stackk = new MyStack<>();
        stackk.push(10);
        stackk.push(20);
        stackk.push(30);
        
        stackk.display();
        
        System.out.println("Top element is " + stackk.peek());
        System.out.println(stackk.pop() + " popped from stack");
        stackk.display();
    }
}
