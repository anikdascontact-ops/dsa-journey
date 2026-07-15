package maths;
import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter principal amount :");
        float P=sc.nextFloat();
        System.out.println("Enter Time(Years):");
        float T=sc.nextFloat();
        System.out.println("Enter interest rate(%) :");
        float I=sc.nextFloat();
        float simpleinterest = (P*I*T)/100;
        System.out.println("Interest amount :"+simpleinterest);
        sc.close();

    }
}
