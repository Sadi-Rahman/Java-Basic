class Animal{
    public void sound() {
         System.out.println("Animal Sounds like ");
    }
}

class Dog extends Animal{
    public void sound() {
         System.out.println("The Dog Says Bark! Bark!");
    }
}

class Cat extends Animal{
    public void sound() {
         System.out.println("The Cats Says Meow Meow!");
    }
}

public class main {
     public static void main(String[] args) {
        Animal myAnimal =new Animal();
        Animal myDog =new Dog();
        Animal myCat =new Cat();

        myAnimal.sound();
        myDog.sound();
        myCat.sound();
    }   
    
}
