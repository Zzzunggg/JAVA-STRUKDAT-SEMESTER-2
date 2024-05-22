package Pertemuan2LinkedList.tugas5;
public class ASstack {
    private static final int MAX_SIZE = 1000;
    private int size;

    private String[] elements;
    
    public ASstack() {
        size = -1;
        elements = new String[MAX_SIZE];

    }
    public void push(String element) {
        size++;
        elements[size] = element;
    
    }
    public String pop() {
        return elements[size--];
    
    }
    public String peek() {
        return elements[size];
    
    }
    
}
