import java.util.Scanner;

public class tugasPalindromeChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Input string, type Q/q for Quit : ");
            String str = in.nextLine();

            // Check for quit condition
            if (str.equalsIgnoreCase("Q")) {
                break;
            }

            // Check if the input string is a palindrome
            if (isPalindrome(str)) {
                System.out.println("PALINDROM");
            } else {
                System.out.println("NOT PALINDROM");
            }
        }
        in.close();
        System.out.println("BUILD SUCCESSFUL");
    }

    // Function to check if a string is a palindrome
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