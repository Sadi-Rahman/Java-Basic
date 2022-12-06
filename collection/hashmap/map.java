package collection.hashmap;

import java.util.*;

public class map {
    public static void main(String[] args) {
        HashMap<String, Integer> contact = new HashMap<String, Integer>();
        HashMap<Integer, String> lang = new HashMap<Integer, String>();

        contact.put("Akash", 101);
        contact.put("Sadi", 102);
        contact.put("Rahman", 103);

        lang.put(1, "Java");
        lang.put(2, "Python");
        lang.put(3, "Rust");
        lang.put(4, "Kotlin");

        // System.out.println(contact.get("Sadi"));
        System.out.println("HashMap " + contact);
        // System.out.println("Keys " + lang.keySet());
        // System.out.println("Values " + lang.values());
        System.out.println("ALL " + lang);

    }

}
