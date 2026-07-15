package maths;
import java.util.Scanner;
public class Largestamongall {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE; // start with the smallest possible number

        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            int num = sc.nextInt();

            if (num == 0) { // stop condition
                break;
            }

            if (num > max) { // update max if current num is bigger
                max = num;
            }
        }

        if (max == Integer.MIN_VALUE) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("Largest number is " + max);
        }

        sc.close();
    }
}


