package nyobakk;

public class AQueue {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();

        queue.enqueue("mie");
        queue.enqueue("ayam");
        queue.display();
        
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
