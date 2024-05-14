import java.util.Scanner;

public class SearchingPengurutanHuruf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input karakter
        System.out.print("Masukkan karakter: ");
        String karakterInput = scanner.nextLine();

        // Ubah karakter menjadi array char
        char[] karakter = karakterInput.toCharArray();

        // Cek keberadaan huruf dengan Binary Search
        System.out.print("Masukkan huruf yang ingin dicari: ");
        char hurufCari = scanner.next().charAt(0);

        int indexHuruf = binarySearch(karakter, hurufCari);

        if (indexHuruf != -1) {
            System.out.println("Huruf '" + hurufCari + "' tidak ditemukan pada indeks " + indexHuruf);
        } else {
            System.out.println("Huruf '" + hurufCari + "' ditemukan.");
        }
        scanner.close();

        // Urutkan karakter dengan Insertion Sort
        insertionSort(karakter);

        // Tampilkan karakter yang telah diurutkan
        System.out.print("Karakter yang diurutkan: ");
        for (char c : karakter) {
            System.out.print(c + " ");
        }
        System.out.println();
    } 
    

    // Metode Binary Search untuk mencari huruf
    private static int binarySearch(char[] arr, char target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    // Metode Insertion Sort untuk mengurutkan karakter
    private static void insertionSort(char[] arr) {
        for (int i = 1; i < arr.length; i++) {
            char current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        
        } 

    } 
}
