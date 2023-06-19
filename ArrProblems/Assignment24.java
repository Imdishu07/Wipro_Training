//  Write a program to initialize an integer array with values and check if a given number is present in the array or not.
// If the number is not found, it will print -1 else it will print the index value of the given  number in the array.

public class Assignment24 {
    public static void main(String[] args) {
        int[] arr = {51,65,21,45,98,67};
        int key = 98;
        int i,flag = 0;

        for ( i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                flag = 1;
                break; 
            }
        }
        if(flag == 1){
            System.out.println(i+1);
        }
        else{
            System.out.println("-1");
        }
    }
}
