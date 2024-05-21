package stacking;
import java.util.Stack;

public class LinkedListerror {
    public static void main(String[] args) {
        Stack stackk = new Stack();
        stackk.push(1);
        stackk.push(2);
        stackk.push(3);
        
        stackk.display();
        
        System.out.println("top element is " + stackk.peek());
        System.out.println(stackk.pop() + " popped from stack ");
        stackk.display();
        
    }
}
