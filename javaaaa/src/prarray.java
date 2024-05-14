public class prarray {

    public static void main(String[] args) {

        int[] nilai = {1, 3, 7, 4, 2, 4, 6, 9, 3, 1};

        // Initialize max and min to the first element of the array
        int max = nilai[0];
        int min = nilai[0];

        // Iterate through the array to find the maximum and minimum values
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
            else if (nilai[i] < min) {
                min = nilai[i];
            }
        }

        // Print the maximum and minimum values
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
