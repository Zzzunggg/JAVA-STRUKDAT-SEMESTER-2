package searching;
public class sequential{
 
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String args[])
    {

        int arr[] = { 3, 2, 1, 4 };
        int x = 2;
        int result = search(arr, x);
        if (result == -1)
            System.out.print(
                "Elemen tidak ditemukan di index");
        else
            System.out.print("Elemen ditemukan"
                             + " di index "
                             + result);
    }
}
