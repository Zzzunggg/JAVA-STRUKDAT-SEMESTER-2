package stacking;
class node {
   int data;
   node next; 
   public node(int data) {
      this.data = data;
      this.next = null;
   }
}

public class Stackkerror {
   private node top;
   public Stackkerror() {
      this.top = null;
   }
   public boolean isEmpty() {
     return top == null;
   }
   public void push(int data) {
      Node newnode = new Node(data);
      if (isEmpty()) {
         System.out.println("Stack is empty");
         return -1;
      }
      int popped = top.data;
      top = top.next;
      return popped;
   } 
   public int peek() {
      if (isEmpty()); {
         System.out.println("Stack is empty");
         return -1;
      }
         return top.data;
   }

   public void display() {
      Node current = top;
      if (isEmpty()) {
         System.out.println("Stack = empty");
         return;
      }
      System.out.println("Stack elements are: ");
      while (current != null) {
         System.out.println(current.data);
         current = current.next;
      }
   }
public String pop() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'pop'");
}
}