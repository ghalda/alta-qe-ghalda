import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Inputan Alas Segitiga
        System.out.print("Input alas segitiga: ");
        float alas = input.nextFloat();

        //Inputan Tinggi Segitiga
        System.out.print("Input tinggi segitiga: ");
        float tinggi = input.nextFloat();

        //Variable luas
        float luas = (alas * tinggi) / 2;

        //Print Luas Segitiga
        System.out.println("Alas Segitiga adalah " + alas);
        System.out.println("Tinggi Segitiga adalah " + tinggi);
        System.out.println("Jadi, Luas Segitiga adalah " + luas + " cm2");
    }
}