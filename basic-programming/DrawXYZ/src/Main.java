import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Draw XYZ");
        System.out.print("Masukkan height: ");
        int height = sc.nextInt();

        drawXYZ(height);

    }

    public static void drawXYZ(int n) {
        int count = 0;
        for (int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                count++;
                if (count % 3 == 0){
                    System.out.print("X ");
                } else if (count % 2 == 0) {
                    System.out.print("Z ");
                } else{
                    System.out.print("Y ");
                }
            }
            System.out.println("");
        }
    }
}