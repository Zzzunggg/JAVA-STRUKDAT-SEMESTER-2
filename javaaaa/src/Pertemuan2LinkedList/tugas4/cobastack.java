package Pertemuan2LinkedList.tugas4;
public class cobastack {
    public static void main(String[] args) {
    ASstack stack = new ASstack();
    stack.push("Kucing");
    stack.push("Kambing");
    stack.push("Kelinci");
    stack.push("Burung");
    

    
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    }
}
