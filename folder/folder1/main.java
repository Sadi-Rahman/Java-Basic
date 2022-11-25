class animal{
    String name;
    public void eat(){
         System.out.println("Can Be Eaten");
    }
}

class dog extends animal{
    public void display() {
         System.out.println("Dogs Name Is " + name);
    }
}

class main{
    
    public static void main(String[] args) {
        dog puppy =new dog();
        puppy.name="Alex";
        puppy.display();
        puppy.eat();
     }
    
}