package basics;
import java.util.Scanner; //including scanner func. for user input

public class userinput {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in); //giving the scanner func. name=sc
        
        System.out.println("Whats your name?:");
        String name=sc.nextLine(); //creating name string and user input
        
        System.out.println("Whats your age?:");
        int age=sc.nextInt(); //creating int and user input
        
        System.out.println("Hello "+name);
        System.out.println("You are "+age+" years old");
        
        sc.close();
    }
}
