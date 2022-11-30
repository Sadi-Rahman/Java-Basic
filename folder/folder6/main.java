import java.util.*;


class main{
public static void main(String[] args) {

    String s;
    int a;
    double num, num1, num2;
    double res =0;
    Scanner sc = new Scanner(System.in);
 
    System.out.println("[1] Addition  [2] Subtraction  [3] Multiplication\n[4] Division  [5] Percentage   [6] Exit");
    System.out.println("Please Enter Your Operation");

    
    s = sc.nextLine();
     if (s.equals("1")) {

        System.out.println("How Many Inputs: ");
        a = sc.nextInt();
        System.out.println("Enter "+a+" Number");
        for (int i = 0; i < a; i++) {
            num = sc.nextDouble();
            res +=num;   
        }            
            System.out.println("Result: "+res);

     } 
     else if (s.equals("2")) {
           
            System.out.println("Enter Number 1 ");
            num1 =sc.nextDouble();
            System.out.println("Enter Number 2 ");
            num2 =sc.nextDouble();
            res=num1-num2;
            System.out.println("Result: "+res);
     } 
     else if(s.equals("3")){

            System.out.println("Enter Number 1 ");
            num1 =sc.nextDouble();
            System.out.println("Enter Number 2 ");
            num2 =sc.nextDouble();
            res=num1*num2;
            System.out.println("Result: "+res);
     }
     else if(s.equals("4")){

            System.out.println("Enter Number 1 ");
            num1 =sc.nextDouble();
            System.out.println("Enter Number 2 ");
            num2 =sc.nextDouble();
            res=num1/num2;
            System.out.println("Result: "+res);
     }
     else if(s.equals("5")){

            System.out.println("Enter Number 1 ");
            num1 =sc.nextDouble();
            System.out.println("Enter Number 2 ");
            num2 =sc.nextDouble();
            res=((num1/num2)*100);
            System.out.println("Result: "+res );
     }
     else if(s.equals("6")){

            System.out.println("Exiting");
            System.exit(0);
     }

     else {
       
         System.out.println("Error");  
     }  
      sc.close();
}
};