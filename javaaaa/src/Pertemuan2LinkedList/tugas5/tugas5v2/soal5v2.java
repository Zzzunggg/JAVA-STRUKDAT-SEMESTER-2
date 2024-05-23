import java.util.Stack;

public class soal5v2 {

    static class Mahasiswa {
        String npm;
        String nama;

        public Mahasiswa(String npm, String nama) {
            this.npm = npm;
            this.nama = nama;
        }
        public String toString() {
            return npm + " " + nama;
        }
    }

    public static void main(String[] args) {
        Stack<Mahasiswa> stackMahasiswa = new Stack<>();
        Stack<Mahasiswa> tempStack = new Stack<>();

        // Menambahkan mahasiswa ke dalam stack secara berurutan
        stackMahasiswa.push(new Mahasiswa("3130023001", "ERISTYA RIEKE FIRNANDA"));
        stackMahasiswa.push(new Mahasiswa("3130023002", "FITRIAN PRAMUDIA EFENDI"));
        stackMahasiswa.push(new Mahasiswa("3130023003", "DIMAS HARDIANSYAH"));
        stackMahasiswa.push(new Mahasiswa("3130023004", "DHISI NAFIULIA HAYYU"));
        stackMahasiswa.push(new Mahasiswa("3130023005", "SITI KHOTIMAH"));
        stackMahasiswa.push(new Mahasiswa("3130023006", "RAMA WAHYU SATRIO"));
        stackMahasiswa.push(new Mahasiswa("3130023007", "ACHMAT CHOIRUN NASAB"));
        stackMahasiswa.push(new Mahasiswa("3130023008", "FATCHUR ROZI"));
        stackMahasiswa.push(new Mahasiswa("3130023009", "MUHAMAD YUSUF"));
        stackMahasiswa.push(new Mahasiswa("3130023010", "DIMAS BAGUS AJI SAPUTRA"));
        stackMahasiswa.push(new Mahasiswa("3130023011", "ANISA PUTRI AULIA"));
        stackMahasiswa.push(new Mahasiswa("3130023012", "MUHAMMAD LUTFI HASAN ROHMATULLOH"));
        stackMahasiswa.push(new Mahasiswa("3130023013", "MOCHAMMAD BAKHRI ILMI KURNIAWAN"));
        stackMahasiswa.push(new Mahasiswa("3130023014", "MULYA NAFA"));
        stackMahasiswa.push(new Mahasiswa("3130023015", "DEVI NADYA SABILLA"));
        stackMahasiswa.push(new Mahasiswa("3130023016", "NASYRUL FUADY"));
        stackMahasiswa.push(new Mahasiswa("3130023017", "AYU PUTRI GIANTI"));
        stackMahasiswa.push(new Mahasiswa("3130023018", "AFRAH AMANI"));
        stackMahasiswa.push(new Mahasiswa("3130023019", "FARA FADILLAH NAMIRA ADJANI"));
        stackMahasiswa.push(new Mahasiswa("3130023020", "LORRIS AGUSTIN HARIYANTO"));
        stackMahasiswa.push(new Mahasiswa("3130023021", "M. CHAFIFULLAH FATHUR A."));
        stackMahasiswa.push(new Mahasiswa("3130023022", "SULTHAN FATARULLAH AKBAR MUKTI"));
        stackMahasiswa.push(new Mahasiswa("3130023023", "BRYENCA RIZKI MARSHELLINE"));
        stackMahasiswa.push(new Mahasiswa("3130023024", "HABIBUR RAHMAN"));
        stackMahasiswa.push(new Mahasiswa("3130023025", "MUHAMMAD DAVID TAUFIKUR RACHMAN"));
        stackMahasiswa.push(new Mahasiswa("3130023026", "ANIFA NIKMATUL AZZA"));
        stackMahasiswa.push(new Mahasiswa("3130023027", "AMAR SAYRIYO AGUNG"));
        stackMahasiswa.push(new Mahasiswa("3130023028", "SOFIAN ALI"));
        stackMahasiswa.push(new Mahasiswa("3130023029", "DINA KAMILIA"));
        stackMahasiswa.push(new Mahasiswa("3130023030", "TRYANDIKA DIAS ANGGONO"));
        stackMahasiswa.push(new Mahasiswa("3130023031", "MUHAMMAD ALDITIYA VEBRIANTO"));
        stackMahasiswa.push(new Mahasiswa("3130023032", "HALIMATUS SAKDIYAH"));
        stackMahasiswa.push(new Mahasiswa("3130023033", "ACHMAD RIZKI MIFTAHUDDIN"));
        stackMahasiswa.push(new Mahasiswa("3130023034", "MUHAMMAD FIRDAUS AGUSTIAN"));
        stackMahasiswa.push(new Mahasiswa("3130023035", "SUSILO MAULANA ERDIANSYAH"));
        stackMahasiswa.push(new Mahasiswa("3130023036", "MUHAMMAD IMAM GHOZALI FEBRIANSYAH"));
        stackMahasiswa.push(new Mahasiswa("3130023037", "UBAIDULLOH AL ACHRORI"));
        stackMahasiswa.push(new Mahasiswa("3130023038", "DWIKY ADE PUTRA ZAKARIA"));
        stackMahasiswa.push(new Mahasiswa("3130023039", "ELVIRA AMELIA PUTRI"));
        stackMahasiswa.push(new Mahasiswa("3130023040", "SULTAN MUHAMMAD DZULFALAH ALFARO"));
        stackMahasiswa.push(new Mahasiswa("3130023041", "MAULA NAHDLIYAH MUCHLIS"));
        stackMahasiswa.push(new Mahasiswa("3130023042", "M.MU'AFFA ADITYA"));
        stackMahasiswa.push(new Mahasiswa("3130023043", "MOCH. AZIZI ALFARIZKI"));
        stackMahasiswa.push(new Mahasiswa("3130023044", "MUHAMMAD IZZUL HAQ"));
        stackMahasiswa.push(new Mahasiswa("3130023045", "MOHAMMAD QO'IS FATHUR ROHMAN"));
        stackMahasiswa.push(new Mahasiswa("3130023046", "MUHAMMAD ZIDAN ILMI AFHAMY"));
        stackMahasiswa.push(new Mahasiswa("3130023047", "ARDAN PRAMUDYA ARIFIANTO"));
        stackMahasiswa.push(new Mahasiswa("3130023048", "IKA NUR PUSPITA RAHAYU"));

        // Pindahkan elemen ke tempStack untuk membalik urutan
        while (!stackMahasiswa.isEmpty()) {
            tempStack.push(stackMahasiswa.pop());
        }

        // Menampilkan daftar mahasiswa dari tempStack
        System.out.println("Daftar Mahasiswa 47 Sistem Informasi Angkatan 2023:");
        while (!tempStack.isEmpty()) {
            System.out.println(tempStack.pop());
        }
    }
}
