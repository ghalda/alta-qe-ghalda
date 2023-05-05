import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Header
        String judul = "Kalkulator Sederhana";
        System.out.println(judul);
        for (int i = 1; i <= judul.length(); i++){
            System.out.print("*");
        }
        System.out.println("");


        boolean confirmation;
        do{
            // input
            System.out.println("Silahkan pilih salah satu operasi hitung:");
            System.out.println("(1) Penjumlahan");
            System.out.println("(2) Pengurangan");
            System.out.println("(3) Perkalian");
            System.out.println("(4) Pembagian");
            int kodeOperasi;

            //checking validation data type
            do {
                System.out.print("Masukkan Angka yang sesuai dengan daftar: ");
                if (!sc.hasNextInt() ) {
                    System.out.println("Hanya Masukkan Angka!");
                    System.out.print("Masukkan Angka yang sesuai dengan daftar: ");
                    sc.next();
                }
                kodeOperasi = sc.nextInt();
            } while (kodeOperasi > 4);

            System.out.print("Masukkan Angka ke-1 : ");
            float a = sc.nextFloat();
            System.out.print("Masukkan Angka ke-2 : ");
            float b = sc.nextFloat();

            if (kodeOperasi == 1){
                Penjumlahan jumlah = new Penjumlahan(a,b);
                System.out.println(a+ " + " +b+ " = " + jumlah.hitung());
            } else if (kodeOperasi == 2) {
                Pengurangan kurang = new Pengurangan(a,b);
                System.out.println(a+ " - " +b+ " = " + kurang.hitung());
            } else if (kodeOperasi == 3) {
                Perkalian kali = new Perkalian(a,b);
                System.out.println(a+ " x " +b+ " = " + kali.hitung());
            } else if (kodeOperasi == 4) {
                Pembagian bagi = new Pembagian(a,b);
                System.out.println(a+ " / " +b+ " = " + bagi.hitung());
            } else {
                System.out.println("Tidak Ada di Daftar");
            }

            System.out.print("Apakah ingin menghitung yang lain? (Y/N) : ");
            String confirm = sc.next();
            confirmation = confirm.equalsIgnoreCase("Y");

        } while (confirmation);
    }
}