import java.util.*;

public class sync {

    static int count=0;
    static  Scanner sc = new Scanner(System.in);
    static int c;

    public synchronized static void incount(){
        count++;

    }


    public static void main(String[] args) {

         System.out.println("Number Of Tickets");
         c=sc.nextInt();

         if (c>2000) {
             System.out.println("Error Number of Tickets is too high");
             System.exit(0);
         }

         Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    incount();
                }
            }
         });

         Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    incount();
                }
            }
         });

         t1.start();
         t2.start();

         try {
             t1.join();
             t2.join();
         } catch (InterruptedException e) {
            e.printStackTrace();
         }

         System.out.println("Tickets: "+count);
         System.out.println("Tickets Left: "+c);
    }
}