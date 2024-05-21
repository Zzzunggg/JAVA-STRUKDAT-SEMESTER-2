package random;
import java.util.Scanner;

public class TugasStrukturData {
    public static void main(String[] args) {
        //input
        double ipk = 3.8;
        //scanner agar user bisa input ipk
        Scanner masukkan= new Scanner(System.in);
        System.out.println("Masukkan IPK anda : ");
        //perintah hasnextdouble untuk memastikan inputan user berupa double atau tidak
        if (masukkan.hasNextDouble()) {
            ipk = masukkan.nextDouble();
        //proses sekaligus output
            if (ipk >= 3.5) {
                System.out.println("Selamat anda mendapat predikat Cumlaude!.");
            } else {
                System.out.println("Nice try yaa.");
            }
        } else {
            System.out.println("Input tidak valid.");
        }
        masukkan.close();
    }
}