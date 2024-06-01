package pertemuan3queuee.tugasqueue2code;
public class Q{
public static void main(String[] args) {
    CircularQueue queue = new CircularQueue();

    queue.enqueue(1);
    queue.enqueue(4);
    queue.enqueue(0);
    queue.enqueue(4);
    queue.display();

    queue.enqueue(9);
    queue.display();

    queue.enqueue(8);
    queue.display();

    queue.enqueue(7); // This should fail cuz it's full
    queue.display();

    queue.dequeue();
    queue.display();

    queue.peek();
    queue.dequeue();
    queue.display();

    queue.enqueue(7);
    queue.display();
}
}