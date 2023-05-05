import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String ori, reverse = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Palindrome Checking");
        System.out.println("Masukkan kata: ");
        ori = input.nextLine();

        boolean palindrome = palindrome(ori, reverse);
        if(palindrome == true){
            System.out.println(ori+" adalah kata Palindrome");
        } else if (palindrome == false){
            System.out.println(ori+" bukan kata Palindrome");
        } else {
            System.out.println("Error");
        }
    }

    public static boolean palindrome(String kata, String reverse) {
        int length = kata.length();

        for(int i = length - 1; i>=0; i--){
            reverse = reverse + kata.charAt(i);
        }

        if(kata.equals(reverse)){
            return true;
        } else{
            return false;
        }
    }
}