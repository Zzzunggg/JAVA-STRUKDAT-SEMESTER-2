package stacking;
import java.util.Scanner;

public class tugasPalindromeChecker {
    public static void main(String[] args) {
        Scanner cuy = new Scanner(System.in);
        while (true) {
            System.out.print("Input string, type Q/q for Quit : ");
            String str = cuy.nextLine();

            // Cek untuk kondisi Quit
            if (str.equalsIgnoreCase("Q")) {
                break;
            }

            // output jika yg diinput berupa palindrom atau tidak
            if (isPalindrome(str)) {
                System.out.println("PALINDROM");
            } 
            else {
                System.out.println("NOT PALINDROM");
            }
        }
        cuy.close();
        System.out.println("BUILD SUCCESSFUL");
    }

    // fungsi untuk mengecek apakah yg diinput adalah palindrom
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}