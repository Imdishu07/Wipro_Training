// Given two strings, a and b, print a new string which is made of the following combination-first character of a, the first character of b, second character of a, second character of b and so on. 
// Any characters left, will go to the end of the result.
// Example1
// i/p:Hello,World
// o/p:HWeolrllod

public class Assignment15 {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";

        int c = a.length();
        for (int i = 0; i < c; i++) {
            System.out.print(a.charAt(i));
            System.out.print(b.charAt(i));
        }
    }
}
