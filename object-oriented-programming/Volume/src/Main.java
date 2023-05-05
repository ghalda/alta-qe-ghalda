import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Header
        String judul = "Penghitung Volume Bangun Ruang 3 Dimensi";
        System.out.println(judul);
        for (int i = 1; i <= judul.length(); i++){
            System.out.print("-");
        }
        System.out.println("");

        boolean confirmation;
        do{
            // input
            System.out.println("Silahkan pilih salah satu Bangun Ruang:");
            System.out.println("(1) Kubus");
            System.out.println("(2) Balok");
            System.out.println("(3) Tabung");
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

                System.out.print("Panjang rusuk kubus (dalam cm): ");
                double rusuk = in.nextDouble();

                Kubus a = new Kubus(rusuk);
                System.out.println("Volume Kubus adalah " +a.volume()+ " cm^3");

            } else if (kodeBangun == 2) {

                System.out.print("Panjang Balok (dalam cm): ");
                double panjang = in.nextDouble();
                System.out.print("Lebar Balok (dalam cm): ");
                double lebar = in.nextDouble();
                System.out.print("Tinggi Balok (dalam cm): ");
                double tinggi = in.nextDouble();

                Balok b = new Balok(panjang, lebar, tinggi);
                System.out.println("Volume Balok adalah " +b.volume()+ " cm^3");

            } else if (kodeBangun == 3) {

                System.out.print("Jari-Jari Tabung (dalam cm): ");
                double jari = in.nextDouble();
                System.out.print("Tinggi Tabung (dalam cm): ");
                double tinggi = in.nextDouble();

                Tabung c = new Tabung(jari,tinggi);
                System.out.println("Volume Tabung adalah " +c.volume()+ " cm^3");

            } else {
                System.out.println("Tidak Ada di Daftar");
            }

            System.out.print("Apakah ingin menghitung bangun ruang lain? (Y/N) : ");
            String confirm = in.next();
            confirmation = confirm.equalsIgnoreCase("Y");

        } while (confirmation);
    }
}