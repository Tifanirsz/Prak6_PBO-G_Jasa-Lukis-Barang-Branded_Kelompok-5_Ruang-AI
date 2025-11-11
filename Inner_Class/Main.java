package Inner_Class;

public class Main{
    public static void main(String[] args) {

        // Data awal jasa
        String[] daftarBarang = {"Sepatu", "Tas", "Jaket", "Dompet"};
        JasaLukis jasa = new JasaLukis("LukisArt Studio", "Jl. Mawar No. 45, Bandung", daftarBarang);

        // Tampilkan info jasa
        jasa.tampilkanInfoJasa();

        // Buat 2 pesanan menggunakan class BuatPemesanan
        Pemesanan p1 = BuatPemesanan.buatPemesanan(jasa, "Rina", "Sepatu", "Motif Bunga Sakura", 250000);
        Pemesanan p2 = BuatPemesanan.buatPemesanan(jasa, "Dika", "Tas", "Grafiti Warna-warni", 300000);

        // Hitung total biaya
        double total = p1.getHarga() + p2.getHarga();

        // Tampilkan hasil akhir
        System.out.println("Total Biaya dari Semua Pesanan: Rp" + total);
        System.out.println("\n=== TERIMA KASIH TELAH MENGGUNAKAN JASA " + jasa.getNamaJasa().toUpperCase() + " ===");
    }
}