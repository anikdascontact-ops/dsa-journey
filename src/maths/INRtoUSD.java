package maths;
import java.util.Scanner;

public class INRtoUSD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Currency(USD/INR) :");
        String currency =sc.nextLine();
        System.out.println("Enter amount :");
        double amount =sc.nextDouble();
        double INR,USD;
        if(currency.equalsIgnoreCase("INR")){
            USD=amount/88.32;
            System.out.println(amount+" INR in USD is "+USD);
        }
        else if(currency.equalsIgnoreCase("USD")){
            INR=amount*88.32;
            System.out.println(amount+" USD in INR is "+INR);
        }
        else{
            System.out.println("Enter valid currency");
        }
        sc.close();

    }
}
