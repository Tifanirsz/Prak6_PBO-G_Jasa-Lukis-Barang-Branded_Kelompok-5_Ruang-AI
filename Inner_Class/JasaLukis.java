package Inner_Class;

public class JasaLukis {
    private String namaJasa;
    private String alamat;
    private String[] daftarBarang;

    // Constructor
    public JasaLukis(String namaJasa, String alamat, String[] daftarBarang) {
        this.namaJasa = namaJasa;
        this.alamat = alamat;
        this.daftarBarang = daftarBarang;
    }

    // Method menampilkan info jasa
    public void tampilkanInfoJasa() {
        System.out.println("===== INFORMASI JASA LUKIS =====");
        System.out.println("Nama Jasa   : " + namaJasa);
        System.out.println("Alamat      : " + alamat);
        System.out.println("Barang yang dapat dilukis:");
        for (String barang : daftarBarang) {
            System.out.println("- " + barang);
        }
        System.out.println();
    }

    // Getter
    public String getNamaJasa() {
        return namaJasa;
    }
}
