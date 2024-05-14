public class inseraraso {
    public static void main(String[] args) {
      int[] value = {90,77,21,20,22};
      insertionSortInt(value);  
    }

public static void insertionSortInt( int[] bilangan ){
    //menampilkan data sebelum disortir
    System.out.println("Sebelum disortir");
    for(int insersyong : bilangan ){
        System.out.print(insersyong + " ");
    }

        for (int i = 1; i < bilangan.length; i++){

        for(int j = i; j > 0; j--){
            if(bilangan[j] < bilangan[j-1]){
                
                int tampungan = bilangan[j];
                bilangan[j] = bilangan[j-1];
                bilangan[j-1] = tampungan;
            }
        }
    }
    //menampilkan data setelah disortir
    System.out.println("\nSesudah disortir");
    for(int insersyong : bilangan ){
        System.out.print(insersyong + " ");
        }
    }
}



