import java.util.Scanner;

public class absensi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Apakah Anda hadir? (ya/tidak): ");
        String jawaban = scanner.nextLine();

        if (jawaban.equalsIgnoreCase("ya")) {
            System.out.println("Absensi H (Hadir)");
        } else if (jawaban.equalsIgnoreCase("tidak")) {
            System.out.print("Apakah Anda izin? (ya/tidak): ");
            jawaban = scanner.nextLine();

            if (jawaban.equalsIgnoreCase("ya")) {
                System.out.println("Absensi I (Izin)");
            } else {
                System.out.println("Absensi A (Tidak Hadir dan Tidak Izin)");
            }
        } else {
            System.out.println("Input tidak valid. Silakan masukkan 'ya' atau 'tidak'.");
        }

        scanner.close();
    }
}