package maths;
import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer :");
        int num = sc.nextInt();
        int i = 1;
        while (i <= num) {
            int divide = num % i;
            if (divide == 0) {

                System.out.print(i+" ");
            
            }
            i++; 
        }
        sc.close();

    }
}
