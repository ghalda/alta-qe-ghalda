import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Header
        String judul = "Penghitung Luas dan Keliling Bangunan";
        System.out.println(judul);
        for (int i = 1; i <= judul.length(); i++){
            System.out.print("-");
        }
        System.out.println("");


        boolean confirmation;
        do{
            // input
            System.out.println("Silahkan pilih salah satu Bangun Ruang:");
            System.out.println("(1) Persegi");
            System.out.println("(2) Segitiga");
            System.out.println("(3) Persegi Panjang");
            int kodeBangun;

            //checking validation data type
            do {
                System.out.print("Masukkan Angka yang sesuai dengan daftar: ");
                if (!in.hasNextInt() ) {
                    System.out.println("Hanya Masukkan Angka!");
                    System.out.print("Masukkan Angka yang sesuai dengan daftar: ");
                    in.next();
                }
                kodeBangun = in.nextInt();
            } while (kodeBangun > 3);

            if (kodeBangun == 1){

                System.out.print("Panjang sisi persegi (dalam cm): ");
                float sisi = in.nextFloat();

                Persegi a = new Persegi(sisi);
                System.out.println("Keliling Persegi adalah " +a.keliling()+ " cm");
                System.out.println("Luas Persegi adalah " +a.luas()+ " cm^2");

            } else if (kodeBangun == 2) {

                System.out.print("Alas Segitiga (dalam cm): ");
                float alas = in.nextFloat();
                System.out.print("Tinggi Segitiga (dalam cm): ");
                float tinggi = in.nextFloat();

                Segitiga b = new Segitiga(alas, tinggi);
                System.out.println("Keliling Segitiga adalah " +b.keliling()+ " cm");
                System.out.println("Luas Segitiga adalah " +b.luas()+ " cm^2");

            } else if (kodeBangun == 3) {

                System.out.print("Panjang persegi (dalam cm): ");
                float panjang = in.nextFloat();
                System.out.print("Lebar persegi (dalam cm): ");
                float lebar = in.nextFloat();

                PersegiPanjang c = new PersegiPanjang(panjang, lebar);
                System.out.println("Keliling Persegi Panjang adalah " +c.keliling()+ " cm");
                System.out.println("Luas Persegi Panjang adalah " +c.luas()+ " cm^2");
            } else {
                System.out.println("Tidak Ada di Daftar");
            }

            System.out.print("Apakah ingin menghitung bangun ruang lain? (Y/N) : ");
            String confirm = in.next();
            confirmation = confirm.equalsIgnoreCase("Y");

        } while (confirmation);
    }
}