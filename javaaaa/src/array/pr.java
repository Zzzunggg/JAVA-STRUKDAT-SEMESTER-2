package array;
public class pr {
    public static void main(String[] args) {
        int [] nilai = {1,3,7,4,2,4,6,9,3,1};
        //sebagai wadah saat looping
        int max=nilai[0];
        int min=nilai[0];
        
        for (int i = 0; i < nilai.length; i++) {
            //mengidentifikasi nilai loop
            //mulai dari 0 karena dimulai dari indeks ke 0
            if (nilai[i]>max){
                max = nilai[i];
            }else if(nilai[i]<min){
                min = nilai[i];
            }
        }
        System.out.println("nilai max = "+max);
        System.out.println("nilai min = "+min);
    }
}