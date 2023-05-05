import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //define input dari user
        System.out.println("Faktor Bilangan");
        Scanner input = new Scanner(System.in);

        int number;
        System.out.print("Masukkan Angka : ");
        number = input.nextInt();
        System.out.println("Faktor bilangan dari " + number + " adalah ");

        //looping
        for(int i = 1; i<=number; i++){
            //condition
            if(number % i == 0){
                System.out.print(i + "\n");
            } else if(number % i != 0){
                System.out.print("");
            }
        }
    }
}