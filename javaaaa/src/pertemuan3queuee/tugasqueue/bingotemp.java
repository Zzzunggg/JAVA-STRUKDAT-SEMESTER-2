package pertemuan3queuee.tugasqueue;

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
            System.out.println("Cannot enqueue " + newElement + ", Queue is full");
            return;
        }

        rear = (rear + 1) % MAX_SIZE;
        elements[rear] = newElement;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Cannot dequeue, Queue is empty");
            return -1; // Returning -1 to indicate the queue is empty
        }

        int deletedElement = elements[front];
        front = (front + 1) % MAX_SIZE;
        size--;

        return deletedElement;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Cannot peek, Queue is empty");
            return -1; // Returning -1 to indicate the queue is empty
        }

        return elements[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == MAX_SIZE;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Queue (front to rear): ");
        int index = front;

        for (int i = 0; i < size; i++) {
            System.out.print(elements[index] + " ");
            index = (index + 1) % MAX_SIZE;
        }

        System.out.println();
    }
}