package file.fi3;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File dir = new File("G:/Java-Basic/file/test");
        dir.mkdir();

        File file1 = new File("G:/Java-Basic/file/test/new.txt");

        try {
            file1.createNewFile();
            System.out.println("Done");
            try {
                for (int i = 0; i < 10; i++) {
                    FileWriter fWriter = new FileWriter("G:/Java-Basic/file/test/new.txt", true);
                    fWriter.write("Hello\n");
                    fWriter.close();
                }
                System.out.println("Done Writing");
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
