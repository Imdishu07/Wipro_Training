// B) Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57. 

import java.util.*;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Number a : ");
        int a = sc.nextInt();

        System.out.print("Enter The Number b : ");
        int b = sc.nextInt();

        if(a%10 == b%10){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
