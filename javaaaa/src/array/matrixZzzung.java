package array;
public class matrixZzzung {
    public static void main(String args[]) {
        int[][] A = {{11, 12, 10}, {14, 25, 26}, {17, 18, 19}};
        int[][] B = {{19, 18, 27}, {26, 15, 24}, {13, 12, 21}};
        int[][] sum = new int[3][3];

        /* Penjumlahan Matriks */
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Hasil Penjumlahan Matriks");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j] + "  ");
            }
            System.out.println();
        }
    }
}