package basics;
import java.util.Scanner;

public class Armstrongno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:");
        int a = sc.nextInt();
        int original=a;
        int sum = 0;
        while (a > 0) {
            int rem = a % 10;
            int cube = rem * rem * rem;//3 digit armstrong no
            sum = sum + cube;
            a = a / 10;

        }
        if (original == sum) {
            System.out.println(original + " is an armstrong number");
        } else {
            System.out.println(original + " is Not an armstrong no");
        }
        sc.close();

    }
}
