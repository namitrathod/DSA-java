package Array;
import java.util.Arrays;
import java.util.Scanner;

public class L21_arrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int []arr = new int[5];

        // input using loop
    for(int i =0; i <arr.length; i++){
        arr[i] = input.nextInt();
    }
    // paste array using loop
    for(int i =0; i <arr.length; i++){
        System.out.println(arr[i]);
    }

    for(int num: arr){ // for every element in the array print element
        System.out.println(num+"");
    }

    System.out.println(Arrays.toString(arr));


    //////////////// array of objects///////////////////////////////////////////////////////////////////////////

    
    }
    
}
