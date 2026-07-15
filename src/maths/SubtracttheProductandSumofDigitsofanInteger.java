package maths;
import java.util.Scanner;

public class SubtracttheProductandSumofDigitsofanInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers :");
        int num = sc.nextInt();
        int product = 1, sum = 0;
        while (num > 0) {
            int rem = num % 10;// last digit
            product = product * rem;
            sum = sum + rem;
            num = num / 10;//eliminates last digit
        }
        int difference = product - sum;
        System.out.println("Result :" + difference);
        sc.close();

    }
}
