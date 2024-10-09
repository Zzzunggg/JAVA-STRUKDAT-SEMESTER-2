class Mobil {
    String warna;
    String merk;

    // Constructor
    Mobil(String warna, String merk) {
        this.warna = warna;
        this.merk = merk;
    }

    void info() {
        System.out.println("Mobil ini berwarna " + warna + " dan bermerek " + merk);
    }
}

// Contoh objek
public class Main {
    public static void main(String[] args) {
        Mobil mobilA = new Mobil("Merah", "Toyota");
        mobilA.info();
    }
}
