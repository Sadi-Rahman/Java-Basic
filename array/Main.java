
import java.util.*;
public class Main {
    public static void main(String[] args) {

        double[] num={2,5.5,6,1,7.4};
        double sum =0;
        double avg;
        double x = num[2];
        System.out.println(x);

        for (double number:num ){
            sum += number;
        }
        

        System.out.println("Sums " + sum);
        
    }
}
