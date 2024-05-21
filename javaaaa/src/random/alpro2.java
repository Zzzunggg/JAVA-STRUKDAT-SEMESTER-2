package random;
import java.util.Scanner;

public class alpro2 {
    public static void main(String[] args) {
        // Membuat array untuk menyimpan 10 angka
        int[] angka = new int[10];
        double total = 0;
        
        // Membaca 10 angka dari pengguna dan menghitung total
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan angka ke-" + (i+1) + ": ");
            angka[i] = input.nextInt();
            total += angka[i];
        }
        
        // Menghitung rata-rata
        double rataRata = total / 10;
        
        // Menampilkan rata-rata ke layar
        System.out.println("Rata-rata: " + rataRata);
    
        input.close();
    }   
}