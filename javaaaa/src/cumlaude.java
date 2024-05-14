import java.util.Scanner;

public class cumlaude {
    public static void main(String[] args) {
        
        double ipk = 3.8;
        
        Scanner masukkan= new Scanner(System.in);
        System.out.println("masukkan ipk lu : ");
        ipk = masukkan.nextDouble();
        
        if(ipk >= 3.5) {
            System.out.println("Selamat anda mendapat Predikat cumlaude. ");
        }
        else if(ipk < 3.5) {
            System.out.println("sayang skali bro. ");
        }
        else {
            System.out.println("Input tidak valid. ");
        }
        masukkan.close();
    }
    
}
