// Given an array of type int, print true if every element is 1 or 4. 

// only14([1, 4, 1, 4]) → true
// only14([1, 4, 2, 4]) → false
// only14([1, 1]) → true

public class Assignment32 {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 2, 4};
        boolean isOnly14 = true;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != 1 && arr1[i] != 4) {
                isOnly14 = false;
            }
        }
        System.out.println(isOnly14);
    }
}
