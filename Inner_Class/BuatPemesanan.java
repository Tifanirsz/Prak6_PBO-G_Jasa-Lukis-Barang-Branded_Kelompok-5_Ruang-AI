package Inner_Class;

public class BuatPemesanan {

    // Method untuk membuat dan menampilkan pemesanan
    public static Pemesanan buatPemesanan(JasaLukis jasa, String namaPelanggan, String jenisBarang, String desainLukisan, double harga) {
        Pemesanan pesan = new Pemesanan(jasa, namaPelanggan, jenisBarang, desainLukisan, harga);
        pesan.tampilkanDetailPemesanan();
        return pesan;
    }
}