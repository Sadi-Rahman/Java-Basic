package collection;
import java.util.*;

class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Akash");
        list.add("Sadi");
        list.add("Rahman");
        list.remove("Rahman");
        System.out.println(list);
    }
};