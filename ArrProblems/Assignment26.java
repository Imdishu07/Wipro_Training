// Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.


public class Assignment26 {
    public static void main(String[] args) {
        int[] arr = {23,43,67,12,43,55};

        int max1 = arr[0];
        int max2 = arr[0];
        int min1 = arr[0];
        int min2 = arr[0];
        for (int i : arr) {
            if (i > max1) {
                max2 = max1;
                max1 = i;
            } else if (i > max2) {
                max2 = i;
            }

            if (i < min1) {
                min2 = min1;
                min1 = i;
            } else if (i < min2) {
                min2 = i;
            }
        }

        System.out.println("Max1: " + max1);
        System.out.println("Max2: " + max2);
        System.out.println("Min1: " + min1);
        System.out.println("Min2: " + min2);
    }
}
