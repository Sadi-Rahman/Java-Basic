package file.fi1;

import java.io.File;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter fWriter = new FileWriter("G:\\Java-Basic\\file\\fi1\\new.txt", true);
            fWriter.write("Hello !!!");
            fWriter.close();
            System.out.println("Done!");
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
