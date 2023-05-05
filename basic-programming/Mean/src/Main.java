import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-Mesin Penghitung Mean-");
        System.out.print("Berapakah data yang ingin diinput? ");
        int length = scan.nextInt();
        double[] nilai = new double[length];

        for(int x = 0; x < nilai.length; x++){
            System.out.print("Input angka ke "+ (x+1)+ ": ");
            nilai[x] = scan.nextInt();
        }

        mean(nilai, length);
    }

    public static void mean(double[] arr, int n){
        double total = 0;
        for(int i = 0; i < n; i++)
        {
            total=total+arr[i];
        }
        System.out.println("Mean dari deretan angka di atas: "+total/n);
    }
}