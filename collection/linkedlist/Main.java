package collection.linkedlist;

import java.util.LinkedList;

class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Akash");
        list.add("Sadi");
        list.add("Rahman");
        list.remove("Rahman");
        System.out.println(list);
    }
};
