package file.fi8;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word you want to search for: ");
        String word = sc.next();
        boolean flag = false;
        int count = 0;

        Scanner sc1 = new Scanner(new FileInputStream("G:/Java-Basic/file/test/read.txt"));
        while (sc1.hasNextLine()) {
            String line = sc1.nextLine();
            // System.out.println(line);
            if (line.indexOf(word) != -1) {
                flag = true;
                count = count + 1;
            }
        }

        if (flag) {
            System.out.println("File contains the word");
            System.out.println("Number of occurrences of the word " + count);
        } else {
            System.out.println("Does not contain the searched word");
        }

        sc.close();

    }
}
