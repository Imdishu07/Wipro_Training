/*
 * Print a version of the given array where all the 10's have been removed. 
 * The remaining elements should shift left towards the start of the array as needed, and the empty 
 * spaces at the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. 
 * You may modify and display the given array or make a new array.
 * withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
 * withoutTen([10, 2, 10]) → [2, 0, 0]
 * withoutTen([1, 99, 10]) → [1, 99, 0]
 */

import java.util.Arrays; 
public class Assignment30 {
    static void ExceptTen(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] == 10){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 10) {
                arr[i] = 0;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 2, 10};
        ExceptTen(arr);
        System.out.print(Arrays.toString(arr));
    }
}
