// Write a java program that will concatenate 2 strings and return the result. The result should be in lowercase.
// Note:If the concatenation creates a double-char, then one of the characters need to be omitted.
// Example1)
// i/p:Sachin,Tendulkar
// o/p:sachin tendulkar

public class Assignment8 {
    public static void main(String[] args) {
        String str1 = "Sachin";
        String str2 = "Tendulkar";

        String ans = "";

        if (str1.endsWith(String.valueOf(str2.charAt(0)))) {
            ans = str1.toLowerCase() + str2.substring(1).toLowerCase();
        }
        else{
            ans = str1.toLowerCase() + " " +str2.toLowerCase();
        }
        System.out.println(ans);
    }
}
