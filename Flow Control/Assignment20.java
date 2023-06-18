//  Write a program to reverse a given number and print


import java.util.*;
public class Assignment20 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number");
        int n = sc.nextInt();

        while(n > 0){
            int LastDigit = n%10;
            n = n/10;
            System.out.print(LastDigit);
            
        }
    }
}

