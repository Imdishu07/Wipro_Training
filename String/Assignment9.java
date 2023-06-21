// Given a string, return a new string made of 'n' copies of the first 2 chars of the original string where 'n' is the length of the string.
// Example1
// i/p:Wipro
// o/p:WiWiWiWiWi

public class Assignment9 {
    public static void main(String[] args) {
        String a = "Wipro";
        for (int i = 0; i < 5; i++) {
            System.out.print(a.charAt(0));
            System.out.print(a.charAt(1));
        }
    }
}
