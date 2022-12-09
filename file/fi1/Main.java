package file.fi1;

//File file = new file("C:\\user\\firstfile.txt");
//import java.io.*;
import java.io.File;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter fWriter = new FileWriter("G:\\Java-Basic\\file\\fi1\\new.txt");
            fWriter.write("Hey !!!");
            fWriter.close();
            System.out.println("Done!");
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
