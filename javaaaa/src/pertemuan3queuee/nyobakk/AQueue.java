package pertemuan3queuee.nyobakk;

public class AQueue {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();

        queue.enqueue("kucing");
        queue.enqueue("kalem");
        queue.enqueue("miaw");
        queue.enqueue("reva");

        queue.display();
       
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        
        queue.display();
    }
}
//bingo!