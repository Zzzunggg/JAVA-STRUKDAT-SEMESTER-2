package pertemuan3queuee.tugasqueue;

public class AQueue {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();

        queue.enqueue(1);
        queue.enqueue(4);
        queue.enqueue(0);
        queue.enqueue(4);

        queue.enqueue(9);
        queue.enqueue(8);
        queue.enqueue(7);
       
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        queue.enqueue(7);
        
        queue.display();
    }
}
//bingo!