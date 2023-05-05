import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean confirmation;
        do{
//Header
            String judul = "Aplikasi Penghitung Ongkos Kirim";
            System.out.println(judul);

            System.out.println("Harga Standar = Rp 5000,- dengan Ketentuan: ");
            System.out.println("- Maksimal Volume: 50cm^3");
            System.out.println("- Berat: 1 kg");
            System.out.println("- Jika berat/volume belum mencapai angka kelipatan selanjutnya, biaya menggunakan harga standar/sebelumnya");

            for (int i = 1; i <= judul.length(); i++){
                System.out.print("-");
            }
            System.out.println("");

            System.out.print("Masukkan Panjang Barang (dalam cm): ");
            float p = in.nextFloat();
            System.out.print("Masukkan Lebar Barang (dalam cm): ");
            float l = in.nextFloat();
            System.out.print("Masukkan Tinggi Barang (dalam cm): ");
            float t = in.nextFloat();
            System.out.print("Masukkan Berat Barang (dalam kg): ");
            float b = in.nextFloat();

            Perhitungan hitung = new Perhitungan(p, l, t, b);
            System.out.println("Volume Barang: "+ hitung.volumeBarang()+ " cm^3");
            System.out.println("Berat Barang: "+b+ " kg");
            hitung.hitungOngkir();

            System.out.print("Apakah ingin menghitung lagi? (Y/N) : ");
            String confirm = in.next();
            confirmation = confirm.equalsIgnoreCase("Y");

        } while (confirmation);
    }
}