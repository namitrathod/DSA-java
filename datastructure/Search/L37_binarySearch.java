package Search;
import java.util.Scanner;

public class L37_binarySearch {
    public static void main(String [] args){
        int [] arr = new int[] {-18,-4, -2, 2,6,7,9,45,89};
        Scanner in = new Scanner(System.in);
        // int target = in.nextInt();
        int target = 89;
        System.out.println("Index of element is "+binarySearch(arr, target));

    }
    static int binarySearch(int [] arr, int target){
        int start =0;
        int end = arr.length-1;    // because last element has index "length -1"
        while (start<=end) {
            // find middle value
            // int middle = (start + end)/2;   // if this is used then there is chances that value get out of the range of integers.
            // therefore this is better
            int mid = start + (end-start)/2;

            if(target<arr[mid]){
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid +1 ;
            }else{
                return mid;
            }

        }
        return -1;
    }

}
