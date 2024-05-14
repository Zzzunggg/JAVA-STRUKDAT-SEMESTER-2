public class uts {

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 9, 0, 4, 2, 1};
        int length = arr.length;
//11 key //j = 12 = 0
        System.out.print("unSorted : ");
        for (int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");

        for (int i = 1; i < length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; 
                
                j = j - 1; 
            }
            arr[j + 1] = key; 

        }
        System.out.println();
        System.out.print("Sorted : ");
        for (int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");

        // Menggunakan pencarian biner untuk mencari elemen tertentu
        int x = 11; //variable x untuk angka yg ingin dicari
        int result = binarySearch(arr, x);
        if (result == -1)
            System.out.println("\nElement " + x + " tidak ditemukan");
        else
            System.out.println("\nElement " + x + " ditemukan di index " + result);
    }

    // Metode untuk pencarian biner
   public static int binarySearch(int arr[], int x) {
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
            else //arr mid > x
                high = mid - 1;
        }

        // Jika elemen tidak ditemukan, kembalikan -1
        return -1;
    }
}