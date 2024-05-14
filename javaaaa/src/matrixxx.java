import java.util.Scanner;

public class matrixxx{
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int i;
    int j;
    int matrikA[][] = new int[3][3];
    int matrikB[][] = new int[3][3];
    int jumlah[][] = new int[3][3];

    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++) {
            System.out.print("Matrik A " + i + "." + j + "= ");
            matrikA[i][j] = input.nextInt();
        }
    }
    System.out.println();

    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++) {
            System.out.print("Matrik B " + i + "." + j + "= ");
            matrikB[i][j] = input.nextInt();
        }
    }

    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++) {
            jumlah[i][j] = matrikA[i][j] + matrikB[i][j];
        }
    }
    System.out.println("\n Matrik A \n");
    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++) {
            System.out.print("  " + matrikA[i][j]);
        }
        System.out.println();
    }

    System.out.println("\nMatrik B\n");
    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++) {
            System.out.print("  " + matrikB[i][j]);
        }
        System.out.println();
    }
    System.out.println("\nMatrik A + Matrik B\n");
    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++) {
            System.out.print("  " + jumlah[i][j]);
        }
        System.out.println();
    }
}
}
