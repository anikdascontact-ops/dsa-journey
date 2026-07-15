package maths;
public class swaping2variables {
    public static void main(String[] args) {
       String x="Water";
       String y="Ice";
       String temp=null; //we can assign NULL or leave it like that
        temp=x;
        x=y;
        y=temp;
       System.out.println("x= "+ x);
       System.out.println("y= "+ y);
    }
}