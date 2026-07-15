package basics;
import java.util.Scanner;

public class Eligibletovote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = sc.nextInt();
        if (isEligible(age)) {
            System.out.println("Can vote");
        } else {
            System.out.println("Cant vote");
        }
        sc.close();
    }

    static boolean isEligible(int n) {
        if (n >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
