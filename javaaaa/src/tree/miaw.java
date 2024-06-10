package tree;

import java.util.Scanner;

public class miaw {
    public static void main(String[] args) {
        Tree pohon = new Tree();

        Scanner input = new Scanner(System.in);
        System.out.print("String: ");
        String data = input.nextLine();

        for (int i = 0; i < data.length(); i++) {
            pohon.insert(String.valueOf(data.charAt(i)));
        }

        input.close();  // Close the Scanner to prevent resource leaks
    }
}
