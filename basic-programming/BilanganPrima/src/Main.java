import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //define input dari user
        int count = 0;
        System.out.println("--Check Bilangan Prima--");
        Scanner input = new Scanner(System.in);


        System.out.print("Masukkan Bilangan : ");
        int bilangan = input.nextInt();
        System.out.println("True/False: " +bilanganPrima(bilangan, count));
    }

    public static boolean bilanganPrima(int number, int counter){
       //looping

        if(number == 1){
            return false;
        }

        for(int i = 2; i<=number; i++){
            //condition
            if(number % i == 0){
                counter++;
            }
        }

        if(counter ==1) {
            return true;
        }else {
            return false;
        }
    }
}