package random;
public class ciba {

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 9, 0, 4, 2, 1};
        int length = arr.length;

        System.out.print("unSorted : ");
        for (int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");



        for (int i = 1; i < length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; 
                
                j = j - 1; 
            }
            arr[j + 1] = key; 

        }
        System.out.println();
        System.out.print("Sorted : ");
        for (int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");

    }
}       