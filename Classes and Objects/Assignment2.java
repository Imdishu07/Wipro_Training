// Create a new class called Calculator with the following methods: 
// 1. A static method called powerInt(int num1,int num2)
// This method should return num1 to the power num2.
// 2. A static method called powerDouble(double num1,int num2).
// This method should return num1 to the power num2.
// 3. Invoke both the methods and test the functionalities.

public class Assignment2 {
    public static int powerInt(int num1, int num2){
        return (int)Math.pow(num1, num2);
    }

    public static int powerDouble(double num1, double num2){
        return (int)Math.pow(num1, num2);
    }

    public static void main(String[] args) {
        System.out.println(powerInt(12, 10));
        System.out.println(powerDouble(1.5, 2.2));
    }
}