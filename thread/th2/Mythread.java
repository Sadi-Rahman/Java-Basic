import java.util.*;

public class Mythread implements Runnable{
    public void run() {
         System.out.println("Thread is Running");        
    }

    public static void main(String[] args) {
        Runnable r1 = new Mythread();
        Thread t1 = new Thread();

        t1.run();
        String str = t1.getName();
         System.out.println(str);

    }

}