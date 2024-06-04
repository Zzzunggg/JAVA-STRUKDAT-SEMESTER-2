package pertemuan3queuee.cinemadanukt;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CinemaQueue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> customerQueue = new LinkedList<>();

        // Menambahkan pelanggan ke dalam antrian
        System.out.println("Masukkan nama pelanggan (atau 'selesai' untuk mengakhiri):");
        while (true) {
            String customer = scanner.nextLine();
            if (customer.equalsIgnoreCase("selesai")) {
                break;
            }
            customerQueue.add(customer);
        }

        // Menampilkan antrian awal
        System.out.println("\nAntrian pelanggan:");
        displayQueue(customerQueue);

        // Memproses pesanan film pelanggan
        while (!customerQueue.isEmpty()) {
            String currentCustomer = customerQueue.poll();
            System.out.println("\nPelanggan saat ini: " + currentCustomer);
            System.out.println("Masukkan nama film yang dipesan oleh " + currentCustomer + " (atau 'batal' untuk membatalkan pesanan):");
            String movie = scanner.nextLine();

            if (!movie.equalsIgnoreCase("batal")) {
                System.out.println(currentCustomer + " telah memesan film: " + movie);
            } else {
                System.out.println(currentCustomer + " membatalkan pesanan.");
            }

            // Menampilkan antrian yang diperbarui
            System.out.println("\nAntrian pelanggan yang tersisa:");
            displayQueue(customerQueue);
        }

        System.out.println("\nSemua pelanggan telah dilayani.");
        scanner.close();
    }

    private static void displayQueue(Queue<String> queue) {
        if (queue.isEmpty()) {
            System.out.println("Tidak ada pelanggan dalam antrian.");
        } else {
            for (String customer : queue) {
                System.out.println(customer);
            }
        }
    }
}

