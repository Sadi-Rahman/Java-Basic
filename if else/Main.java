// Your First Program

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    //System.out.println("Write sadi"); 


       Scanner sc = new Scanner(System.in);
       String s= sc.nextLine();
       
        if(s.equals("sadi")){
                System.out.println("You Wrote Sadi"); 

        }
        else if(s.equals("hello")){
            System.out.println("hi");
        }
        else{
            System.out.println("Wrong");
        }
    }
}