package stacking;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Membuat stack baru yang awalnya kosong
        Stack<Integer> stackA = new Stack<>();
        
        // Melakukan operasi push
        stackA.push(5);
        stackA.push(7);
        stackA.push(9);
        stackA.push(11);
        
        // Melakukan operasi pop satu kali
        int poppedValue = stackA.pop();
        
        // Menampilkan nilai yang di-pop
        System.out.println("Nilai yang di-pop: " + poppedValue);
        
        // Menampilkan isi stack setelah operasi pop
        System.out.print("Isi stack setelah operasi pop: ");
        System.out.println(stackA);
    }

}

