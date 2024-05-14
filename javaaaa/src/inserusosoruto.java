public class inserusosoruto {  
    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
       
    public static void main(String args[]){    
        int[] arrayyy = {7,8,0,9,3,1};    
        System.out.println("Sebelum Insertion Sort");    
        for(int i:arrayyy){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        insertionSort(arrayyy);//sorting array using   
           
        System.out.println("Setelah Insertion Sort");    
        for(int i:arrayyy){    
            System.out.print(i+" ");    
        }    
    }    
}    
