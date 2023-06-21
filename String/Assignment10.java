// Write a java program that will return the first half of the string, if the length of the string is even.
// It should return null for odd length string.
// Example1
// i/p:TomCat
// o/p:Tom

public class Assignment10 {
    public static void main(String[] args) {
        String a = "TomCat";
        int b = a.length();
        if (b%2 == 0) {
            for (int i = 0; i < b/2; i++) {
                System.out.print(a.charAt(i));
            }
        } else {
            System.out.print("Null");
        }
        System.out.println();
    }
}
