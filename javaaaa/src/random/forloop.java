package random;
import java.util.Scanner;

public class forloop {

public static void main(String[] args) {
    System.out.println("Count down how many seconds? ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    
    doCountDown(num);
    sc.close();//move here otherwise you might get null pointer exception
}
public static void doCountDown(int num){
    for(int i=num;i>=0;i--){//It should count down to zero (replaced num with 0)
        System.out.println(i);
        waitASec();
      
    }   System.out.println("Go!");
}   
private static void waitASec() {
    try {
        Thread.sleep(1000);//This approach better than java.util.Date
    } catch (InterruptedException ex) {
        ex.printStackTrace();
  
    }
}

}