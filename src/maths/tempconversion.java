package maths;
import java.util.Scanner;

public class tempconversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter type (C/F) :");
        String Type=sc.nextLine();
        System.out.println("Enter Temp :");
        float Temp=sc.nextFloat();
        if(Type.equalsIgnoreCase("F")){
            float tempC=(Temp-32)*5/9;
            System.out.println("Temp in Celcius :"+tempC);
        }
        else if (Type.equalsIgnoreCase("C")) {
            float tempF=(Temp * 9/5)+32;
            System.out.println("Temp in Fahrenheit :"+tempF);
        }
        else{
            System.out.println("Dumb!!!");
        }
        sc.close();
    }
}
