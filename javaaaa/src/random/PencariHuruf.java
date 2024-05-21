package random;
import java.util.Arrays;
import java.util.Scanner;

public class PencariHuruf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan string
        System.out.println("Masukkan sebuah string:");
        String inputString = scanner.nextLine();

        // Meminta pengguna memasukkan huruf yang akan dicari
        System.out.println("Masukkan huruf yang ingin Anda cari:");
        char targetChar = scanner.next().charAt(0);

        // Mengonversi string menjadi array karakter
        char[] charArray = inputString.toCharArray();

        // Mengecek apakah huruf ada dalam string dan menghitung jumlah kemunculannya
        int count = 0;
        for (char c : charArray) {
            if (c == targetChar) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("Huruf '" + targetChar + "' ditemukan dalam string.");
            System.out.println("Jumlah kemunculan huruf '" + targetChar + "' adalah " + count + ".");

            // Mengurutkan huruf-huruf dalam string
            Arrays.sort(charArray);

            // Menampilkan string yang telah diurutkan
            System.out.println("String setelah diurutkan huruf-hurufnya:");
            System.out.println(new String(charArray));
        } else {
            System.out.println("Huruf '" + targetChar + "' tidak ditemukan dalam string.");
        }
        scanner.close();
    }
}

