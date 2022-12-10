package file.fi2;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class Main {
    public static void main(String args[]) {
        try {
            // Creating an object of a file
            File f0 = new File("G:new.txt");
            if (f0.createNewFile()) {
                System.out.println("File " + f0.getName() + " is created successfully.");
            } else {
                System.out.println("File is already exist in the directory.");
                try {
                    FileWriter fWriter = new FileWriter("G:new.txt", true);
                    fWriter.write("\nHi !!!");
                    fWriter.close();
                    System.out.println("Done!");
                } catch (Exception e) {
                    System.out.println(e);
                    e.printStackTrace();
                }

            }
        } catch (IOException exception) {
            System.out.println("An unexpected error is occurred.");
            exception.printStackTrace();
        }

    }
}