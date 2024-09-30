import java.util.Scanner;

public class HitungUmur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Deklarasi variabel dengan tipe byte
        byte tahunLahir;
        byte tahunSekarang;

        // Input tahun lahir
        System.out.print("Masukkan tahun lahir Anda (misalnya 95 untuk 1995): ");
        tahunLahir = scanner.nextByte();

        // Input tahun saat ini
        System.out.print("Masukkan dua digit tahun saat ini (misalnya 23 untuk 2023): ");
        tahunSekarang = scanner.nextByte();

        // Hitung umur
        byte umur = (byte) ((tahunSekarang >= tahunLahir) ? (tahunSekarang - tahunLahir) : (100 - tahunLahir + tahunSekarang));

        // Output umur
        System.out.println("Umur Anda saat ini: " + umur + " tahun");
        
        scanner.close();
    }
}
