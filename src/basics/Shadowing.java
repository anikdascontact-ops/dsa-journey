package basics;
public class Shadowing {
    static int x = 50;

    public static void main(String[] args) {
        System.out.println("Before shadowing :" + x);
        int x = 100;// local variable
        System.out.println("Shadowing : " + x);
        fun();// function calling
    }

    static void fun() {
        System.out.println("Another method : " + x);
    }
}
