package pertemuan3queuee.tugasqueue2code;

class CircularQueue {
    private static final int MAX_SIZE = 6;
    private int[] elements;
    private int size;
    private int front;
    private int rear;

    public CircularQueue() {
        elements = new int[MAX_SIZE];
        size = 0;
        front = 0;
        rear = -1;
    }

    public void enqueue(int newElement) {
        if (isFull()) {
            System.out.println("queue penuh, tidak bisa queue angka " + newElement);
            return;
        }

        rear = (rear + 1) % MAX_SIZE;
        elements[rear] = newElement;
        size++;
        System.out.println("angka " + newElement + " enqueue ke antrian ");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("tidak bisa dequeue, queuenya kosong");
            return -1; // Return -1 to indicate the queue is empty
        }

        int deletedElement = elements[front];
        front = (front + 1) % MAX_SIZE;
        size--;
        System.out.println("angka " + deletedElement + " dequeue dari queue");
        return deletedElement;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("tidak bisa peek, queue kosong");
            return -1; // Returning -1 to indicate the queue is empty
        }

        System.out.println("angka terdepan sekarang = " + elements[front]);
        return elements[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == MAX_SIZE;
    }

    public void display() {
        System.out.println("================================");
        if (isEmpty()) {
            System.out.println("queue kosong");
        } else {
            System.out.print("queue sekarang = ");
            int index = front;
            for (int i = 0; i < size; i++) {
                System.out.print(elements[index] + " ");
                index = (index + 1) % MAX_SIZE;
            }
            System.out.println();
        }
        System.out.println("================================");
    }
}