//  Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be passed as Command Line arguments.
// Example1)
// C:\>java Sample 1 2 3
// O/P: Please enter 4 integer numbers

public class Assignment34 {
    public static void main(String[] args) {
        if(args.length != 4){
            System.out.println("Please Enter Four Integer Number");
            return;
        }

        int[][] arr = new int[2][2];
        arr[0][0] = Integer.parseInt(args[0]);
        arr[0][1] = Integer.parseInt(args[1]);
        arr[1][0] = Integer.parseInt(args[2]);
        arr[1][1] = Integer.parseInt(args[3]);

        int temp = arr[0][0];
        arr[0][0] = arr[1][1];
        arr[1][1] = temp;

        temp = arr[0][1];
        arr[0][1] = arr[1][0];
        arr[1][0] = temp;
        
        System.out.println("Reversed Array : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
