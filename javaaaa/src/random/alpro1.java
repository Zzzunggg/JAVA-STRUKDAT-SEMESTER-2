package random;
import java.util.Scanner;

public class alpro1  {
    public static void main(String[] args) {
        // Membuat array untuk menyimpan 10 angka
        int[] angka = new int[10];
        // Membaca 10 angka dari pengguna
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan angka ke-" + (i+1) + ": ");
            angka[i] = input.nextInt();
        }
        
        // Menampilkan elemen pertama dan terakhir dari array
        System.out.println("Elemen pertama: " + angka[0]);
        System.out.println("Elemen terakhir: " + angka[9]);
        input.close();
    }

}