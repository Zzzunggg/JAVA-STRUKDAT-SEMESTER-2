package pertemuan3queuee.cinemadanukt;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Mahasiswa {
    String nama;
    boolean sudahLunasUKT;

    Mahasiswa(String nama, boolean sudahLunasUKT) {
        this.nama = nama;
        this.sudahLunasUKT = sudahLunasUKT;
    }
}

public class SimulasiKRS {
    public static void main(String[] args) {
        Queue<Mahasiswa> antrian = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        // Input data mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i+1) + ": ");
            String nama = scanner.nextLine();
            System.out.print("Apakah mahasiswa tersebut sudah melunasi UKT? (ya/tidak): ");
            String sudahLunasInput = scanner.nextLine();
            boolean sudahLunasUKT = sudahLunasInput.equalsIgnoreCase("ya");
            antrian.add(new Mahasiswa(nama, sudahLunasUKT));
        }

        // Proses antrian
        Queue<Mahasiswa> antrianFinal = new LinkedList<>();
        int size = antrian.size();

        for (int i = 0; i < size; i++) {
            Mahasiswa m = antrian.poll();
            if (m.sudahLunasUKT) {
                antrianFinal.add(m);
            } else {
                antrian.add(m);
            }
        }

        // Gabungkan kembali antrian yang belum lunas UKT ke belakang
        while (!antrian.isEmpty()) {
            antrianFinal.add(antrian.poll());
        }

        // Tampilkan urutan mahasiswa setelah proses
        System.out.println("\nUrutan mahasiswa setelah proses KRS:");
        for (Mahasiswa m : antrianFinal) {
            System.out.println("Nama: " + m.nama + ", Lunas UKT: " + (m.sudahLunasUKT ? "Ya" : "Tidak"));
        }

        scanner.close();
    }
}
