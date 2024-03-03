package Array;
import java.util.Arrays;
import java.util.Scanner;

public class L24_2Darray_input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] arr = new int [3][3];
        // arr.lenght give number of rows
        
        for(int row=0; row <arr.length; row++){
            for(int col=0; col< arr[row].length; col++) //arr[row].length gives no. of element in the ith row of array arr.
            { 
                arr[row][col]= in.nextInt();
            }
        }

//////////////////////Output of 2d array ///////////////////////////////////////////////////////
        for(int row=0; row <arr.length; row++){
            for(int col=0; col< arr[row].length; col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
//       output of above code
        // 41 42 43
        // 44 45 46
        // 47 48 49

        for(int row =0; row < arr.length; row ++){
            System.out.println(Arrays.toString(arr[row]));
        }
        /* output
        [41, 42, 43]
        [44, 45, 46]
        [47, 48, 49]
        */
/////////////////////////////////// enhanced for loop ///////////////////////////
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
