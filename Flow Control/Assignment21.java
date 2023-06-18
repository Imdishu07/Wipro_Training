// Write a Java program to find if the given number is palindrome or not

import java.util.Scanner;

public class Assignment21 {
    public static boolean isPalindrome(int n) {
        int reversedNumber = 0;
        int originalNumber = n;

        while (n > 0) {
            int digit = n % 10;
            reversedNumber = reversedNumber * 10 + digit;
            n /= 10;
        }

        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = sc.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}
