// Given 2 strings, a and b, return a new string of the form short+long+short, with the shorter string on the outside 
// and the longer string on the inside.
// The strings will not be the same length, but they may be empty (length 0).
// If input is "hi" and "hello", then output will be "hihellohi".

import java.util.*;
public class Assignment12 {
    public static void main(String[] args) {
        // String a = "hi";
        // String b = "Hello";

        // System.out.print(a);
        // System.out.print(b);
        // System.out.print(a);

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        int c = a.length();
        int d = b.length();

        if (c<d) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(a);
        } else {
            System.out.println(b);
            System.out.println(a);
            System.out.println(b);
        }
    }
}
