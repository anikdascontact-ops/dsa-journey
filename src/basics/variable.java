package basics;
public class variable {
    public static void main(String[] args) {
        int x=12;                   //value initialisation
        long y=10654684654169L;     //for big integer value
        float z=3.14f;              //for decimal value
        double a=3.1415926465848;   //for more precise decimal value
        char symbol='@';
        String name="Anik";
        
        System.out.println("My number is : " +x); //printing the number and also concatination (+x)
        System.out.println("My number is : " +y);
        System.out.println("My number is : " +z);
        System.out.println("My number is : " +a);
        System.out.println(symbol);
        System.out.println("Hello " + name);

    }
}
