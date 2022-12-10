package file.fi4;

import java.io.*;
import java.util.*;

class A extends Thread {
    int j;

    A(int z) {
        j = z;
    }

    public void run() {
        try {
            for (int i = 0; i < j; i++) {
                FileWriter fWriter = new FileWriter("G:/Java-Basic/file/test/New1.txt", true);
                fWriter.write("Hello\n");
                fWriter.close();
            }
            System.out.println("Done Writing");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int z = sc.nextInt();

        File dir = new File("G:/Java-Basic/file/test");
        dir.mkdir();

        File file1 = new File("G:/Java-Basic/file/test/New1.txt");

        try {
            file1.createNewFile();
            System.out.println("Done");

        } catch (Exception e) {
            System.out.println(e);
        }

        A a = new A(z);
        a.start();

    }
}