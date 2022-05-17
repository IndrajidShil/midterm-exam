package datastructure.collections;

import java.util.LinkedList;

public class UseLinkedList {

    /*
     *
     * demonstrate how to use LinkedList that includes add,remove elements
     * use (1) for each loop, for loop (2) and (3) while loop with Iterator to retrieve and print out data
     *
     */

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        list.add("Sam");
        list.add("Nacer");
        list.add("Jay");
        list.add("Indra");
        list.add("Mo");

        System.out.println(list);

        for (int i = 0; i< list.size(); i++) {
            System.out.println(list.get(i));

        }


    }
}
