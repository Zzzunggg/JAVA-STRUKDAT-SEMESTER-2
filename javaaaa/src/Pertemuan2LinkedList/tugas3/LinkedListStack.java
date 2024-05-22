package Pertemuan2LinkedList.tugas3;

public class LinkedListStack {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(2);
        stack.push(4);
        stack.push(6);
      
        stack.display();
        System.out.println(stack.pop() + " popped from stack");
        
        stack.push(8); // Push pertama dengan nilai 8
        System.out.println(stack.pop() + " popped from stack");
     
    
        stack.push(8); // Push kedua dengan nilai

        
        System.out.println("Top element is " + stack.peek());

  
       


        stack.display();
    }
}
