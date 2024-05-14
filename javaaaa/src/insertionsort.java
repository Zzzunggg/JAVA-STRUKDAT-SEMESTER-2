public class insertionsort {

    public static void main(String args[]) {
  
      int[] arrayyy = {7, 9, 3, 1, 2};  // Array yang akan diurutkan
  
      System.out.println("Sebelum Insertion Sort (Sebelum Pengurutan Insertion)");
      for (int i : arrayyy) {
        System.out.print(i + " ");  // Mencetak array yang belum diurutkan
      }
      System.out.println();
  
      insertionSort(arrayyy);  // Memanggil fungsi insertionSort untuk mengurutkan array
  
      System.out.println("Setelah Insertion Sort (Setelah Pengurutan Insertion)");
      for (int i : arrayyy) {
        System.out.print(i + " ");  // Mencetak array yang sudah diurutkan
      }
    }
  
    public static void insertionSort(int array[]) {
  
      int n = array.length;
      for (int j = 1; j < n; j++) {
        int key = array[j];  // Elemen yang sedang diproses untuk disisipkan
  
        int i = j - 1;
        while ((i > -1) && (array[i] > key)) {  // Geser elemen yang lebih besar ke kanan
          array[i + 1] = array[i];
          i--;
        }
  
        array[i + 1] = key;  // Sisipkan elemen key pada posisi yang benar
      }
    }
  }
  