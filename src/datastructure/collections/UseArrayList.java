package datastructure.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

    /*
     *
     * demonstrate how to use ArrayList that includes add,remove elements
     * use (1) for each loop, for loop (2) and (3) while loop with Iterator to retrieve and print out data
     *
     */

    public static void main(String[] args) {

        List<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(1);
        al.add(2);

        System.out.println(al);

        Iterator itr = al.iterator();

//        for(int i=3; i<=5;i++){
//            al.add(i);
//        }
//        System.out.println(al);

        for (int num: al) {
            System.out.println(num);
        }
        
//        while (itr.hasNext()) {
//            int x = (Integer)itr.next();
//            if (x < 10) {
//                itr.remove();
//            }
//        }
//        System.out.print(al);

    }
}
