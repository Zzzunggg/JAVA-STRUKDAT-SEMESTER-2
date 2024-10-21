// Kelas Orang sebagai superclass
class Orang {
    protected String nama;
    protected int umur;

    // Constructor untuk kelas Orang
    public Orang(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Metode sapa
    public void sapa() {
        System.out.println("Halo, nama saya " + this.nama + " dan saya berumur " + this.umur + " tahun.");
    }
}

// Subclass Mahasiswa yang mewarisi dari kelas Orang
class Mahasiswa extends Orang {
    // Constructor untuk kelas Mahasiswa
    public Mahasiswa(String nama, int umur) {
        super(nama, umur); // Memanggil constructor kelas Orang
    }

    // Metode belajar khusus untuk Mahasiswa
    public void belajar() {
        System.out.println(nama + " sedang belajar.");
    }
}

// Subclass Dosen yang mewarisi dari kelas Orang
class Dosen extends Orang {
    // Constructor untuk kelas Dosen
    public Dosen(String nama, int umur) {
        super(nama, umur); // Memanggil constructor kelas Orang
    }

    // Metode ajar khusus untuk Dosen
    public void ajar() {
        System.out.println(nama + " sedang mengajar.");
    }
}

public class tugass2 {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa dan Dosen
        Mahasiswa mahasiswa = new Mahasiswa("Andi", 20);
        Dosen dosen = new Dosen("Budi", 45);

        // Memanggil metode dari masing-masing objek
        mahasiswa.sapa();
        mahasiswa.belajar();
        
        dosen.sapa();
        dosen.ajar();
    }
}
