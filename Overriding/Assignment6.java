
// Create  a base class Fruit with name ,taste and size as its attributes. 
// Create a method called eat() which describes the name of the fruit and its taste. 
// Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each fruit taste.

class fruit{
    String name,taste;
    int size;

    void eat(){
        System.out.println("Eating Fruits ... ");
    }
}

class Apple extends fruit{
    Apple(){
        name = "apple";
        taste = "Sweet";
    }

    void eat(){
        System.out.println("Fruit name is "+name+" "+taste+" in taste");
    }
}

class orange extends fruit{
    orange(){
        name = "orange";
        taste = "sour";
    }

    void eat(){
        System.out.println("Fruit name is "+name+" "+taste+" in taste");
    }
}

public class Assignment6 {
    public static void main(String[] args) {
        fruit F = new fruit();
        Apple A = new Apple();
        orange O = new orange();

        F.eat();
        A.eat();
        O.eat();
    }
}
