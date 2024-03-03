package Array;
import java.util.Arrays;

public class L29_reversingAnArray {
    public static void main(String[] args) {
        int [] arr = {1,3,4,5,19,10,14};
        reverse(arr);
    }
    static void reverse(int [] arr){
        int start = 0;
        int end = arr.length -1;
        
        while (start<end) {
            swap(arr, start, end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap (int [] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
