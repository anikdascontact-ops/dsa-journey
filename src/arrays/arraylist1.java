package arrays;

import java.util.ArrayList;

public class arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(70);
        list.add(12);
        list.add(15);
        list.add(33);

        // list.set(2,63);  //to replace element at index=2 with 63
        //list.remove(2);   //to remove any element at index=2
        System.out.println(list.contains(33));// to check if an element is there
        System.out.println(list);

    }
}
