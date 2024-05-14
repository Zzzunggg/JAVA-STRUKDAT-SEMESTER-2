import java.util.Scanner;

public class PR_StrukturData {
    public static void main(String[] args) {

        float IPK;
        Scanner Masukkan= new Scanner(System.in);
        System.out.print("Masukkan IPK yang didapat : ");
        
        if (Masukkan.hasNextDouble()) {

        IPK = Masukkan.nextFloat();
        
        if(IPK >= 3.5){
            System.out.println("Azekk Cumlaude. ");
        }
            else if(IPK < 3.5){
            System.out.println("Nice Try bro. ");
            }
        } 
           
            Masukkan.close();
        }
    }   