import java.util.Arrays;
import java.util.Scanner;

public class SearchAndSort {
    
    // Metode pencarian biner
    static int binarySearch(char arr[], char x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            
            // Periksa apakah x berada di tengah
            if (arr[mid] == x)
                return mid;
            
            // Jika x lebih besar, abaikan setengah kiri
            if (arr[mid] < x)
                low = mid + 1;
            
            // Jika x lebih kecil, abaikan setengah kanan
            else
                high = mid - 1;
        }
        
        // Jika elemen tidak ditemukan, kembalikan -1
        return -1;
    }
    
    // Metode pengurutan dengan insertion sort
    static void insertionSort(char arr[]) {
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            char key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input karakter yang akan dicari
        System.out.print("Masukkan karakter yang ingin Anda cari dan urutkan: ");
        String input = scanner.nextLine();
        char[] charArray = input.toCharArray();
        
        // Input huruf yang akan dicari
        System.out.print("Masukkan huruf yang ingin Anda cari: ");
        char searchChar = scanner.next().charAt(0);
        
        // Urutkan karakter menggunakan insertion sort
        insertionSort(charArray);
        System.out.println("Huruf-huruf yang diurutkan: " + Arrays.toString(charArray));
        
        // Cari huruf menggunakan binary search
        int result = binarySearch(charArray, searchChar);
        if (result == -1)
            System.out.println("Huruf " + searchChar + " tidak ditemukan.");
        else
            System.out.println("Huruf " + searchChar + " ditemukan di indeks " + result + ".");
        
        scanner.close();
    }
}
