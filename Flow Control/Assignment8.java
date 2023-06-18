// Initialize two character variables in a program and display the characters in alphabetical order.

import java.util.*;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Character 1 : ");
        char var1 = sc.next().charAt(0);

        System.out.print("Enter Character 2 : ");
        char var2 = sc.next().charAt(0);

        if(var1 > var2){
            System.out.println(var2 + "," + var1);
        }else{
            System.out.println(var1 + "," + var2);
        }
    }
}
