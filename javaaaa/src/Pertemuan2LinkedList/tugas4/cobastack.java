package Pertemuan2LinkedList.tugas4;
public class cobastack {
    public static void main(String[] args) {
    ASstack stack = new ASstack();
    stack.push("kucing");
    stack.push("harimau");
    stack.push("burung");
    stack.push("bebek");
    
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    }
}
