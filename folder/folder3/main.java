import java.util.*;
class Login{
     Scanner sc;
     String uname,pass;

     public Login(Scanner sc){
        this.sc=sc;
        insertData();
     }


public void insertData() {
     System.out.println("Enter Username: ");
     uname=sc.nextLine();

      System.out.println("Enter Password: ");
      pass=sc.nextLine();

      valid();
    
    }
public void valid() {
    if(uname.equals("admin")){
        if (pass.equals("admin")) {
             System.out.println("Login Successfull");
              System.out.println("The Length of the Password is " + uname.length());
           }
           else{
             System.out.println("Wrong Password");
           }
    }
    else{
         System.out.println("Wrong Username");
        
        } 
    }
}
class main{
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 Login l=new Login(sc);
 }
};