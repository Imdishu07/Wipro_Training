// Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string. 
// You may assume that n is between 0 and the length of the string, inclusive. 

// Example1
// i/p:Wipro,3
// o/p:propropro

public class Assignment16 {
    public static void main(String[] args) {
        String a = "Wipro";
        int b = 3;
        int c = a.length();

        for (int i = c-b; i < c; i++) {
            for (int j = c-b; j < a.length(); j++) {
                System.out.println(a.charAt(j));
            }
        }
    }
}
