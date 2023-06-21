// Write a Program to check whether a given String is Palindrome or not.

import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String P = sc.nextLine();

        StringBuffer PL = new StringBuffer(P);
        PL.reverse();
        String rev = PL.toString();

        if(P.equals(rev)) {
            System.out.println("String Is Palindrome");
        }
        else{
            System.out.println("String Is Not Palindrome");
        }
    }
}
