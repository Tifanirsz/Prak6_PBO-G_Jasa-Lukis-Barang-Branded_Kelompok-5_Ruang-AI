package Inner_Class;

public class Pemesanan {
    private String namaPelanggan;
    private String jenisBarang;
    private String desainLukisan;
    private double harga;
    private JasaLukis jasa; // referensi ke class luar

    // Constructor pemesanan
    public Pemesanan(JasaLukis jasa, String namaPelanggan, String jenisBarang, String desainLukisan, double harga) {
        this.jasa = jasa;
        this.namaPelanggan = namaPelanggan;
        this.jenisBarang = jenisBarang;
        this.desainLukisan = desainLukisan;
        this.harga = harga;
    }

    // Method menampilkan detail pemesanan
    public void tampilkanDetailPemesanan() {
        System.out.println("=== Detail Pemesanan ===");
        System.out.println("Nama Pelanggan : " + namaPelanggan);
        System.out.println("Jenis Barang   : " + jenisBarang);
        System.out.println("Desain Lukisan : " + desainLukisan);
        System.out.println("Harga          : Rp" + harga);
        System.out.println("Dilayani oleh  : " + jasa.getNamaJasa());
        System.out.println();
    }

    public double getHarga() {
        return harga;
    }
}