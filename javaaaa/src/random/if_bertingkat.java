package random;
import java.util.Scanner;

public class if_bertingkat {
    public static void main(String[] args) {
        
        float nilai;
        Scanner masukan= new Scanner(System.in);
        System.out.print("Masukan nilai yang didapat : ");
        nilai = masukan.nextFloat();
        if(nilai > 80){
            System.out.println("Anda Mendapat Nilai A. ");
            if(nilai==100){
                System.out.println("Luar Biasa Nilai Sempurna 100.");
            }
        }     
        else if(nilai > 70){
            System.out.println("Anda Mendapat Nilai B. ");
            if(nilai>=79){
                System.out.println("Sedikit Lagi Dapat Nilai A.");
            }
        }     
        else if(nilai > 60){
            System.out.println("Anda Mendapat Nilai C. ");
        }
        else if(nilai > 50){
            System.out.println("Anda Mendapat Nilai D. ");
        }
        else {
            System.out.println("Anda Mendapat Nilai E. ");
        }
        masukan.close();
    }
}