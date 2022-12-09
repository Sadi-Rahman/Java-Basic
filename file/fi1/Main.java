package file.fi1;

//File file = new file("C:\\user\\firstfile.txt");
//import java.io.*;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        File F = new File("G:\\Java-Basic\\file\\new.txt");
        if (F.exists()) {
            System.out.println("Exists");
        } else {
            System.out.println("Created In " + F.getPath());
        }

    }
}
