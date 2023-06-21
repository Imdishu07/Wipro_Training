// Write a java program that accepts a string and returns a new string without the first and last character of the input string.
// Example1
// i/p:Suman
// o/p:uma

public class Assignment11 {
   public static void main(String[] args) {
     String a = "Suman";
     int b = a.length();
     for (int i = 1; i < b-1; i++) {
        System.out.print(a.charAt(i));
     }
   } 
}
