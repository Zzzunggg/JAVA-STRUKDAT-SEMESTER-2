import java.util.Arrays;
public class inseruso {
    public static void main(String[] args) {
        int[]angka={5,9,8,0,6,1};
        System.out.println("Sebelum disorting :"+ Arrays.toString(angka));
        for (int i = 1; i <= angka.length-1; i++){
            int nilai=angka[1];
            int nomor= i-1;
            while(nomor>=0 && angka[nomor]<nilai){
                angka[nomor+1]=angka[nomor];
                nomor--;
            }
            angka[nomor+1]=nilai;
        }
        System.out.println("Setelah disorting :"+ Arrays.toString(angka));
    }
}
