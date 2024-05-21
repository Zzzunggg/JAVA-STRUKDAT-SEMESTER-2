package searching;
public class InterpolationSearchh {
    public static boolean interpolationSearch(int[] array, int target){
        int low = 0;
        int high = array.length - 1;

        while (low <= high && target >= array[low] && target <= array[high]){
            int pos = low + ((target - array[low]) * (high - low) / (array[high] - array[low]));
            
            if (array[pos] == target) {
                return true;
            } else if (array[pos] < target){
                low = pos + 1;

            } else {
                high = pos - 1;
            }
            return false;
            }
        return false;

    }
public static void main(String[] args) {
    int[] array = {1, 2, 4, 5, 7, 9};
    int target = 2;
    if (interpolationSearch(array, target)){
        System.out.println("Element found");
    } else {
        System.out.println("Element not found");
    }  
  }    
}



    
    

