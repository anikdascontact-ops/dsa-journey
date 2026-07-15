package basics;
import java.util.Scanner;

public class Reversed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int a = sc.nextInt();
        int reversed = 0;
        while (a > 0) {
            int rem = a % 10;
            a = a / 10;
            reversed = reversed * 10 + rem;

        }
        System.out.println(reversed);
        sc.close();
    }
}
