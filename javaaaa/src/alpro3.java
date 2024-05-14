import java.util.Scanner;

public class alpro3 {
    public static void main(String[] args) {
        // Membuat array untuk menyimpan 10 angka
        int[] angka = new int[10];
        int inputAngka = 0;
        
        // Membaca 10 angka dari pengguna dan menyimpannya ke array
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan angka ke-" + (i+1) + ": ");
            angka[i] = input.nextInt();
        }
        
        // Mengambil angka yang dimasukkan oleh pengguna
        System.out.print("Masukkan angka yang ingin Anda cari: ");
        inputAngka = input.nextInt();
        
        // Mencari angka yang dimasukkan oleh pengguna di array
        for (int i = 0; i < 10; i++) {
            if (angka[i] == inputAngka) {
                System.out.println("Angka ditemukan di indeks: " + i);
                break;
            } else if (i == 9) {
                System.out.println("Angka tidak ditemukan.");
            }
        }
        input.close();
    }
}