import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Konversi Nilai
        // Kondisi 1 : Nilai 80 - 100 = A
        // Kondisi 2 : Nilai 65 - 79 = B+
        // Kondisi 3 : Nilai 50 - 64 = B
        // Kondisi 4 : Nilai 35 - 49 = C
        // Kondisi 5 : Nilai 0 sampai 34 = D
        // Kondisi 6 : Nilai < 0 dan >100 = Invalid

        //define input nama, nilai angka, dan nilai huruf
        System.out.println("Konversi Nilai Mahasiswa");
        String nama;
        float nilai_angka;
        String nilai_huruf = "";

        //define input dari user
        Scanner input = new Scanner(System.in);

        //define input nama
        System.out.print("Masukkan Nama Mahasiswa : ");
        nama = input.nextLine();

        //define input Nilai Angka
        System.out.print("Masukkan Nilai Mahasiswa : ");
        nilai_angka = input.nextFloat();

        //condition
        if(nilai_angka >= 80 && nilai_angka <= 100){
            nilai_huruf = "A";
        } else if(nilai_angka >= 65 && nilai_angka <= 79){
            nilai_huruf = "B+";
        } else if(nilai_angka >= 50 && nilai_angka <= 64){
            nilai_huruf = "B";
        } else if (nilai_angka >= 35 && nilai_angka <= 49){
            nilai_huruf = "C";
        } else if (nilai_angka >= 0 && nilai_angka <= 34){
            nilai_huruf = "D";
        } else if (nilai_angka < 0 || nilai_angka > 100){
            nilai_huruf = "invalid";
        }

        //Print result
        System.out.print("Mahasiswa bernama " + nama + " mendapatkan nilai " + nilai_huruf);
    }
}