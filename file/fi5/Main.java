package file.fi5;

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
                FileWriter fWriter = new FileWriter("G:/Java-Basic/file/test/New2.txt", true);
                fWriter.write("Hello\n");
                fWriter.close();
            }
            System.out.println("Done Writing File 1");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

class B extends Thread {
    int k;

    B(int y) {
        k = y;
    }

    public void run() {
        try {
            for (int i = 0; i < k; i++) {
                FileWriter fWriter = new FileWriter("G:/Java-Basic/file/test/New3.txt", true);
                fWriter.write("Hii\n");
                fWriter.close();
            }
            System.out.println("Done Writing File 2");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for File 1(z): ");
        int z = sc.nextInt();
        System.out.println("Enter the value for File 2(y): ");
        int y = sc.nextInt();

        File dir = new File("G:/Java-Basic/file/test");
        dir.mkdir();

        File file1 = new File("G:/Java-Basic/file/test/New2.txt");
        File file2 = new File("G:/Java-Basic/file/test/New3.txt");

        try {
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("Done");

        } catch (Exception e) {
            System.out.println(e);
        }

        A a = new A(z);
        B b = new B(y);
        a.start();
        b.start();

        sc.close();
    }
}