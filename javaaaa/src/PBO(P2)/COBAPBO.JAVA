package PBO(P2);
class PersegiPanjang {
    private int panjang;
    private int lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public int getPanjang() {
        return panjang;
    }

    public int hitungLuas() {
        return panjang * lebar;
    }
}

public class COBAPBO {
    public static void main(String[] args) {
        PersegiPanjang persegiPanjang = new PersegiPanjang(5, 3);
        System.out.println("Luas persegi panjang: " + persegiPanjang.hitungLuas());
    }
}

