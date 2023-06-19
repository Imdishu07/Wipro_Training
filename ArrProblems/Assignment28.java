// Write a program to remove the duplicate elements in an array and print the same.
// Example :
// I/P:{12,34,12,45,67,89}
// O/P:{12,34,45,67,89}
import java.util.*;
public class Assignment28 {
    public static void main(String[] args) {
		
		int[] array = {12, 34, 12, 45, 67, 89, 45};
		Arrays.sort(array);									
														
		for(int i = 0; i < array.length; i++) {				
			if(i != array.length-1) {
				if(array[i] != array[i+1])
					System.out.print(array[i]+" ");
			}
			else
				System.out.println(array[i]);				
		}
	}
}
