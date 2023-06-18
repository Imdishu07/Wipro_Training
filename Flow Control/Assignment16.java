// Write a program to check if a given number is prime or not.

import java.util.*;
public class Assignment16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entered No. : ");
        int n = sc.nextInt();

        if(n == 2){
            System.out.print("Entered No. Is Prime Number");
        }
        else{
            boolean isPrime = true;
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i == 0){
                    isPrime = false;
                }
            }
            if(isPrime == true){
                System.out.print("Entered No. Is Prime Number");
            }else{
                System.out.print("Entered No. Is Not Prime Number");
            }
        }
    }
}

