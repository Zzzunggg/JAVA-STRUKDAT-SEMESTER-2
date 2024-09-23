
class PersegiPanjang {
    private int panjang;
    private int lebar;

    // Konstruktor untuk menginisialisasi panjang dan lebar
    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Getter untuk panjang
    public int getPanjang() {
        return panjang;
    }

    // Getter untuk lebar
    public int getLebar() {
        return lebar;
    }

    // Metode untuk menghitung luas persegi panjang
    public int hitungLuas() {
        return panjang * lebar;
    }
}

public class COBAPBOversigpt {
    public static void main(String[] args) {
        // Membuat objek PersegiPanjang
        PersegiPanjang persegiPanjang = new PersegiPanjang(5, 3);

        // Menghitung luas
        int luas = persegiPanjang.hitungLuas();

        // Mencetak hasil dengan lebih detail
        System.out.println("Panjang: " + persegiPanjang.getPanjang());
        System.out.println("Lebar: " + persegiPanjang.getLebar());
        System.out.println("Luas persegi panjang: " + luas);
    }
}
