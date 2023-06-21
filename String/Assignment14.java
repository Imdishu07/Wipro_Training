//  Write a Java program that accepts a string (with * in it). The program should return a new string in which the following 
//  characters are removed-*,the characters that are to the left and right of *

// Example1
// i/p:ab*cd
// o/p:ad

public class Assignment14 {
        public static void main(String[] args) {
        String str = "Dis*ant";
        int pos = str.indexOf("*");
        StringBuffer sbr = new StringBuffer(str);
        sbr.delete(pos -1, pos +2);
        System.out.println(sbr);
    }
}
