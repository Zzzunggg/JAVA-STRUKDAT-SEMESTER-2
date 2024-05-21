import java.util.Scanner;

public class confess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Aku sebenarnya suka sama kamu (terima/tolak/temenan aja): ");
        String jawaban = scanner.nextLine();

        if (jawaban.equalsIgnoreCase("terima")) {
            System.out.println("Asikk jadian");
        } else if (jawaban.equalsIgnoreCase("tolak")) {
            System.out.println("yaah Nice Try ges");
        } else if (jawaban.equalsIgnoreCase("temenan aja")) {
            System.out.println("hahaha friendzone");
        } else {
            System.out.println("penasaran seumur hidup");
        }

        scanner.close();
    }
}
