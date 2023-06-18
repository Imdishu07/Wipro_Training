// Initialize a character variable in a program and 
// print 'Alphabhet' if the initialized value is an alphabhet, 
// print 'Digit' if the initialized value is a number, and 
// print 'Special Character', if the initialized value is anything else.

import java.util.*;
class Assignment9
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter : ");
        char item1 = sc.next().charAt(0); 
        if((item1>96 && item1<123)||(item1>64 && item1<91))
            System.out.println("Alphabet");
        else if(item1>47 && item1<58)
            System.out.println("Digit");
        else
            System.out.println("Special Character");
    }
    }