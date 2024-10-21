// Superclass Orang
class Orang {
    protected String nama;
    protected int umur;
    protected String alamat;

    // Constructor untuk Orang
    public Orang(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    // Method berbicara
    public void berbicara() {
        System.out.println(nama + " berbicara.");
    }
}

// Subclass Mahasiswa yang mewarisi dari Orang
class Mahasiswa extends Orang {
    private String nim;
    private String jurusan;

    // Constructor untuk Mahasiswa
    public Mahasiswa(String nama, int umur, String alamat, String nim, String jurusan) {
        super(nama, umur, alamat); // Memanggil constructor kelas Orang
        this.nim = nim;
        this.jurusan = jurusan;
    }

    // Method belajar
    public void belajar() {
        System.out.println(nama + " dengan NIM " + nim + " sedang belajar di jurusan " + jurusan + ".");
    }
}

// Subclass Dosen yang mewarisi dari Orang
class Dosen extends Orang {
    private String npp;
    private String matakuliah;

    // Constructor untuk Dosen
    public Dosen(String nama, int umur, String alamat, String npp, String matakuliah) {
        super(nama, umur, alamat); // Memanggil constructor kelas Orang
        this.npp = npp;
        this.matakuliah = matakuliah;
    }

    // Method mengajar
    public void mengajar() {
        System.out.println(nama + " dengan NPP " + npp + " sedang mengajar mata kuliah " + matakuliah + ".");
    }
}

public class tugass {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa("Purba", 20, "Jl. Merdeka", "3130023048", "Kedokteran");
        // Membuat objek Dosen
        Dosen dosen = new Dosen("Yusuf", 50, "Jl. Pegangsaan", "8980899", "Pemrograman Berbasis Objek");

        // Memanggil metode dari superclass dan subclass
        mahasiswa.berbicara();
        mahasiswa.belajar();
        
        dosen.berbicara();
        dosen.mengajar();
    }
}
