package inheritance.single;

class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }

    void cat(){
        System.out.println("Meow meow!");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
         Animal a = new Animal();
         a.sound();

         Dog d = new Dog();
         d.sound();
         d.cat();
    }
}
