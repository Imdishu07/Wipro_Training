// Write a program to check if a given integer number is odd or even.

import java.util.*;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int a = sc.nextInt();

        if (a%2 == 0) {
            System.out.println("Number Is Even");
        }
        else{
            System.out.println("Number Is Odd");
        }
    }
}
