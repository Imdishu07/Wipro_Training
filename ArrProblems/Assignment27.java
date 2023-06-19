// Write a program to initialize an array and print them in a sorted order.

import java.util.*;

public class Assignment27 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Elements : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter Array Elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.print("Sorted Array : ");
        for(int element : arr){
            System.out.print(element + " ");
        }
     }
}
