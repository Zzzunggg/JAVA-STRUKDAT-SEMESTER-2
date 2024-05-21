package random;
public class suhuuuu {
    public static void main(String[] args) {
        int suhu[] = {66,69,77,74,76,77};
        int total = 0;
        for(int i=0;i<suhu.length;i++){
            System.out.println("Suhu ke-" +i+ " = " +suhu[i] );
            total+=suhu[i];
        }
        System.out.println("Total suhu= " +total);
    }
}
