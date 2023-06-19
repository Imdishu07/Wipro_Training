public class Assignment33 {
    public static void main(String[] args) {
        int[] a = {7, 7, 7};
        int[] b = {3, 8, 9};
        int[] result = middle(a, b);
        System.out.println("Result: [" + result[0] + ", " + result[1] + "]");
    }

    public static int[] middle(int[] a, int[] b) {
        int[] newArr = new int[2];
        newArr[0] = a[1];
        newArr[1] = b[1];
        return newArr;
    }
}
