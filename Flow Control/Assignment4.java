// A) Write a program to check if a given integer number is Positive, Negative, or Zero. 

import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Take A Number : ");
        int a = sc.nextInt();

        if (a>0)
        {
            System.out.println("Number Is Positive");
        }
        else if(a<0)
        {
            System.out.println("Number Is Negative");
        }
        else
        {
            System.out.println("Number Is Zero");
        }
    }
}
