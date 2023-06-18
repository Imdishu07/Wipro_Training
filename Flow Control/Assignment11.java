// Initialize a character variable with an alphabhet in a program.

import java.util.*;

public class Assignment11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int i;
        
       if(c>='a'&&c<='z') {
		System.out.println(c+"->");
		i=(int)c;
		c=(char)(i-32);
		System.out.println(c);
		}
		
		else {
			System.out.println(c+"->");
		    i=(int)c;
			c=(char)(i+32);
			System.out.println(c);
		}
    }
}
