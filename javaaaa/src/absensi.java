import java.util.Scanner;

public class absensi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Apakah Anda hadir? (ya/tidak/Izin): ");
        String jawaban = scanner.nextLine();
      
        //proses sekaligus output
        if (jawaban.equalsIgnoreCase("ya")) {
            System.out.println("Absensi H (Hadir)");
        } else if (jawaban.equalsIgnoreCase("tidak")) {
            System.out.println("Absensi A (Tidak Hadir/Tidak Izin)");
        } else if (jawaban.equalsIgnoreCase("izin")) {
            System.out.println("Absensi I (Izin)");
        } else {
            System.out.println("Input tidak valid. Silakan masukkan 'ya' atau 'tidak'.");
        }

        scanner.close();
    }
}
