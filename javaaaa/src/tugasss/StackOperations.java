package tugasss;
import java.util.Stack;

public class StackOperations {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Operasi push(2), push(4), dan push(6) secara berurutan
        stack.push(2);
        stack.push(4);
        stack.push(6);

        // Melakukan operasi pop dan push(8) secara bergantian sebanyak dua kali
        stack.pop(); // Pop pertama
        stack.push(8); // Push pertama dengan nilai 8
        stack.pop(); // Pop kedua
        stack.push(8); // Push kedua dengan nilai 8

        // Menampilkan nilai di puncak stack setelah operasi terakhir
        if (!stack.isEmpty()) {
            System.out.println("Nilai di puncak stack setelah operasi terakhir: " + stack.peek());
        } else {
            System.out.println("Stack kosong.");
        }
    }
}
