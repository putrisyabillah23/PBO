public class MahasiswaTest {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        Mahasiswa mahasiswa2 = new Mahasiswa();

        mahasiswa1.setNoInduk("12204");
        mahasiswa1.setNama("Teguh");
        mahasiswa1.setAlamat("Pondok Indah");
        mahasiswa1.setUsia(19);
        mahasiswa1.setIpk(3.45);

        mahasiswa2.setNoInduk("12205");
        mahasiswa2.setNama("Enggar");
        mahasiswa2.setAlamat("Jagaraksa");
        mahasiswa2.setUsia(20);
        mahasiswa2.setIpk(3.90);

        mahasiswa1.showMessageDialog(1);
        mahasiswa2.showMessageDialog(2);
    }
}