import java.util.Scanner;

public class kumlodd {
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
        masukkan.close();
    }
    
}
