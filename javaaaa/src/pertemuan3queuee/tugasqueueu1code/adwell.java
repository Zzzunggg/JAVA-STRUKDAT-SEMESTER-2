package pertemuan3queuee.tugasqueueu1code;
import java.util.LinkedList;
import java.util.Queue;

public class adwell {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        int maxSize = 6;

        enqueue(queue, maxSize, 1);
        enqueue(queue, maxSize, 4);
        enqueue(queue, maxSize, 0);
        enqueue(queue, maxSize, 4);
        printQueue(queue);

        enqueue(queue, maxSize, 9);
        printQueue(queue);

        enqueue(queue, maxSize, 8);
        printQueue(queue);

        enqueue(queue, maxSize, 7); 
        printQueue(queue);

        dequeue(queue);
        printQueue(queue);

        peekQueue(queue);
        dequeue(queue);
        printQueue(queue);

        enqueue(queue, maxSize, 7);
        printQueue(queue);
    }

    public static void enqueue(Queue<Integer> queue, int maxSize, int number) {
        if (queue.size() < maxSize) {
            queue.add(number);
            System.out.println("enqueue " + "angka " + number );
        } else {
            System.out.println("queue full, tidak bisa enqueue angka " + number);
        }
    }

    public static void dequeue(Queue<Integer> queue) {
        if (!queue.isEmpty()) {
            int removed = queue.remove();
            System.out.println("dequeue " + "angka " +  removed );
        } else {
            System.out.println("queue kosong, ga ada yg didequeue");
        }
    }

    public static void peekQueue(Queue<Integer> queue) {
        if (!queue.isEmpty()) {
            int front = queue.peek();
            System.out.println("angka terdepan sekarang = " + front);
        } else {
            System.out.println("queue kosong");
        }
    }

    public static void printQueue(Queue<Integer> queue) {

        System.out.print("queue saat ini = ");
        for (int number : queue) {
            System.out.print(number + " ");
        }
        System.out.println();
   
    }
}
