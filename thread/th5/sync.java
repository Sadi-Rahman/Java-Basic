import java.util.*;

public class sync {
    static int count=0;
    Scanner sc = new Scanner(System.in);
    int c;

    public synchronized static void incount(){
        count++;
    }

    public static void main(String[] args) {
         System.out.println("Enter The Number Of Tickets");
    }

}