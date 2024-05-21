public class InterpolationSearch {
    // Method untuk melakukan pencarian interpolasi
    public static void main(String[] args) {
        int[] array = {11, 13, 14, 15, 16};
        int target = 15;
    
        // Panggil method interpolationSearch untuk mencari target dalam array
        if (interpolationSearch(array, target)) {
            System.out.println("Target " + target + " ditemukan dalam array" + result);
        } else {
            System.out.println("Target tidak ditemukan dalam array");
        }
    }
public static boolean interpolationSearch(int[] array, int target) {
        int low = 0; // Indeks awal array
        int high = array.length - 1; // Indeks akhir array
        boolean result = interpolationSearch(array, target, low, high);
        
        while (low <= high && target >= array[low] && target <= array[high]) {
            // Hitung posisi yang diestimasi menggunakan rumus interpolasi
            int pos = low + ((target - array[low]) * (high - low)) / (array[high] - array[low]);

            if (array[pos] == target) {
                // Jika elemen yang diestimasi sama dengan target, kembalikan true
                return true;
            } else if (array[pos] < target) {
                // Jika elemen yang diestimasi kurang dari target, geser indeks rendah
                low = pos + 1;
            } else {
                // Jika elemen yang diestimasi lebih besar dari target, geser indeks tinggi
                high = pos - 1;
            }
        }
        // Jika tidak ditemukan, kembalikan false
        return false;
    }
}