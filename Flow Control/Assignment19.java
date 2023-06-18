// Write a program to print * in Floyds format (using for and while loop)
public class Assignment19{
    public static void main(String args[]){
    int rows = Integer.parseInt(args[0]);
        for(int i=0; i<=rows; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}