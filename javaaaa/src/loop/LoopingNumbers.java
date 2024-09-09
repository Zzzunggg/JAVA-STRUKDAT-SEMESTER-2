package loop;;

public class LoopingNumbers {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};  // Angka-angka yang ingin diulang
        int i = 0;

        while (true) {  // Looping tanpa henti
            System.out.println(numbers[i]);  // Cetak angka
            i = (i + 1) % numbers.length;  // Reset indeks ke 0 setelah mencapai angka terakhir
        }
    }
}

