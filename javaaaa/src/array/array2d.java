package array;
public class array2d {
    public static void main(String[] args) {
        int [] [] coba = new int [3] [3];
        
        coba [0] [0] = 12;
        coba [0] [1] = 8;
        coba [0] [2] = 6;
        coba [1] [0] = 7;
        coba [1] [1] = 4;
        coba [1] [2] = 6;
        coba [2] [0] = 8;
        coba [2] [1] = 5;
        coba [2] [2] = 1;

        for (int i=0;i<coba.length;i++) {
            for (int j=0;j<coba.length;j++) {
                System.out.print(coba[i] [j]+" " );
            }
            System.out.println("");
        }
    } 
}
