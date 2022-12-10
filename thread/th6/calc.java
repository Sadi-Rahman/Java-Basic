package thread.th6;

import java.util.*;

class A1 extends Thread {
    int i, j;

    A1(int x, int y) {

        i = x;
        j = y;
    }

    @Override
    public void run() {
        System.out.println("Thread A ---Arithmatic--- ");
        System.out.println("SUM: " + (i + j));
        System.out.println("SUBTRACTION: " + (i - j));
        System.out.println("MUILTIPLY: " + (i * j));
        System.out.println("DIVIDE: " + (i / j));
        System.out.println("END Of Thread A\n");
    }
}

class B1 extends Thread {
    int i;

    B1(int z) {
        i = z;
    }

    @Override
    public void run() {
        System.out.println("\nThread B ---Trignometric--- ");
        System.out.println("SINE of: " + i + " is: " + Math.sin(i));
        System.out.println("COS of: " + i + " is: " + Math.cos(i));
        System.out.println("TAN of: " + i + " is: " + Math.tan(i));

        System.out.println("END Of Thread B");
    }
}

public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 Numbers for Arithmatic Calculation ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Enter 1 Numbers for Trignometric Calculation ");
        int z = sc.nextInt();

        A1 a1 = new A1(x, y);
        B1 b1 = new B1(z);

        a1.start();
        b1.start();

    }

}