package Pertemuan2LinkedList.tugas4;

public class ASstack {
    private static final int MAX_SIZE = 100;
    private int size;
    private String[] elements;

    public ASstack() {
        size = -1;
        elements = new String[MAX_SIZE];
    }

    public void push(String element) {
        if (size < MAX_SIZE - 1) {
            size++;
            elements[size] = element;
            System.out.println(element + " pushed to stack");
        } else {
            System.out.println("Stack overflow, cannot push " + element);
        }
    }

    public String pop() {
        if (size >= 0) {
            return elements[size--];
        } else {
            System.out.println("Stack underflow, cannot pop");
            return null;
        }
    }

    public String peek() {
        if (size >= 0) {
            return elements[size];
        } else {
            System.out.println("Stack is empty, cannot peek");
            return null;
        }
    }

    public void display() {
        if (size >= 0) {
            System.out.println("Stack elements:");
            for (int i = size; i >= 0; i--) {
                System.out.println(elements[i]);
            }
        } else {
            System.out.println("Stack is empty");
        }
    }
}