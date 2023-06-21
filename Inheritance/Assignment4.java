// Create a class named ‘Animal’ which includes methods like eat() and sleep().
// Create a child class of Animal named ‘Bird’ and override the parent class methods. Add a new method named fly().
// Create an instance of Animal class and invoke the eat and sleep methods using this object.
// Create an instance of Bird class and invoke the eat, sleep and fly methods using this object.

class Animal{
    void eat(){
        System.out.println("Animal Is Eating");
    }

    void sleep(){
        System.out.println("Animal Is Sleeping");
    }
}

class Bird extends Animal{
    void eat(){
        System.out.println("Bird Is Eating");
    }

    void sleep(){
        System.out.println("Bird Is Sleeping");
    }

    void fly(){
        System.out.println("Birds Are Flying");
    }
}

public class Assignment4{
    public static void main(String[] args) {
        Animal obj = new Animal();

        obj.eat();
        obj.sleep();

        Bird obj2 = new Bird();

        obj2.eat();
        obj2.sleep();
        obj2.fly();
    }
}