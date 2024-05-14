import java.util.Scanner;

public class tugasPALINDROME{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Input string, type 0/q for Quit: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            boolean isPalindrome = true;

            for (int i = 0; i < input.length() / 2; i++) {
                char charAtStart = input.charAt(i);
                char charAtEnd = input.charAt(input.length() - 1 - i);

                if (charAtStart != charAtEnd) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                System.out.println("PALINDROM");
            } else {
                System.out.println("NOT PALINDROM");
            }
        } scanner.close();
     System.out.println("BUILD SUCCESSFUL");
    } 
}