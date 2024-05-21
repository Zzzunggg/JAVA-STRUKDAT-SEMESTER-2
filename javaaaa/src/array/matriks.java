package array;
public class matriks {
    public static void main(String[] args) {
        // Matriks pertama
        int[][] matrix1 = { {4, 6, 9},
                            {6, 1, 8},
                            {7, 8, 9} };

        // Matriks kedua
        int[][] matrix2 = { {4, 9, 8},
                            {6, 5, 4},
                            {3, 2, 9} };

        // Matriks hasil penjumlahan
        int[][] result = new int[3][3];

        // Melakukan penjumlahan matriks
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Menampilkan hasil penjumlahan
        System.out.println("Hasil Penjumlahan Matriks:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
