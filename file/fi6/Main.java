package file.fi6;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // long elapsedTi m e=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for File 1(a): ");
        int a = sc.nextInt();
        System.out.println("Enter the value for File 2(b): ");
        int b = sc.nextInt();

        File dir = new File("G:/Java-Basic/file/test");
        dir.mkdir();

        File file1 = new File("G:/Java-Basic/file/test/New4.txt");
        File file2 = new File("G:/Java-Basic/file/test/New5.txt");

        try {
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("Done");

            try {
                long startTime = System.nanoTime();
                for (int i = 0; i < a; i++) {
                    FileWriter fWriter = new FileWriter("G:/Java-Basic/file/test/New4.txt", true);
                    fWriter.write("Hello\n");
                    fWriter.close();
                }
                long elapsedTime = System.nanoTime() - startTime;
                System.out.println("Execution time: " + elapsedTime + " nanoseconds and " + (elapsedTime / 1000000)
                        + " milliseconds");
                System.out.println("Done Writing File 1(a)");
            } catch (Exception e) {
                System.out.println(e);
            }

            try {
                long startTime = System.nanoTime();
                for (int i = 0; i < b; i++) {
                    FileWriter fWriter = new FileWriter("G:/Java-Basic/file/test/New5.txt", true);
                    fWriter.write("Hi\n");
                    fWriter.close();

                }
                long elapsedTime = System.nanoTime() - startTime;
                System.out.println("Execution time: " + elapsedTime + " nanoseconds and " + (elapsedTime / 1000000)
                        + " milliseconds");
                System.out.println("Done Writing File 2(b)");

            } catch (Exception e) {
                System.out.println(e);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        sc.close();
    }
}