// Class Buku dengan setter dan getter untuk atribut nama, stok, dan harga satuan
class Buku {
    private String nama;
    private int stok;
    private int hargaSatuan;
    private int hargaTotal;

    // Constructor
    public Buku(String nama, int stok, int hargaSatuan) {
        this.nama = nama;
        this.stok = stok;
        this.hargaSatuan = hargaSatuan;
        this.hargaTotal = 0; // Inisialisasi awal
    }

    // Setter untuk nama buku
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk nama buku
    public String getNama() {
        return this.nama;
    }

    // Setter untuk stok buku
    public void setStok(int stok) {
        this.stok = stok;
    }

    // Getter untuk stok buku
    public int getStok() {
        return this.stok;
    }

    // Setter untuk harga satuan
    public void setHargaSatuan(int hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    // Getter untuk harga satuan
    public int getHargaSatuan() {
        return this.hargaSatuan;
    }

    // Getter untuk harga total
    public int getHargaTotal() {
        return this.hargaTotal;
    }

    // Method untuk menghitung total harga
    public void totalHarga() {
        this.hargaTotal = this.stok * this.hargaSatuan;
    }
}

public class PenjualanBuku {
    public static void main(String[] args) {
        // Membuat objek untuk setiap jenis buku
        Buku bukuFiksi = new Buku("Buku Fiksi", 20, 30000);
        Buku bukuNonFiksi = new Buku("Buku Non-Fiksi", 15, 25000);
        Buku bukuPelajaran = new Buku("Buku Pelajaran", 10, 50000);

        // Menghitung total harga untuk setiap buku
        bukuFiksi.totalHarga();
        bukuNonFiksi.totalHarga();
        bukuPelajaran.totalHarga();

        // Menampilkan hasil total harga untuk setiap jenis buku
        System.out.println(bukuFiksi.getNama() + ": Rp. " + bukuFiksi.getHargaTotal());
        System.out.println(bukuNonFiksi.getNama() + ": Rp. " + bukuNonFiksi.getHargaTotal());
        System.out.println(bukuPelajaran.getNama() + ": Rp. " + bukuPelajaran.getHargaTotal());

        // Menghitung total keseluruhan
        int totalKeseluruhan = bukuFiksi.getHargaTotal() + bukuNonFiksi.getHargaTotal() + bukuPelajaran.getHargaTotal();
        System.out.println("Total keseluruhan: Rp. " + totalKeseluruhan);
    }
}
