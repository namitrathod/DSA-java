// package Recursion;
import java.util.Arrays;

public class L70_selectionSort {
    public static void main(String[] args) {
        int [] arr = {1,4,6,3,2,45,32};
        int max =0;
        selection(arr, 0, arr.length, max);
        System.out.println(Arrays.toString(arr));
        
    }
    static void selection(int[] arr,int c,int r, int max){
        if(r==0){
            return;
        }
        if(c<r){
        if(arr[c]>arr[max]){
            max = c;
            selection(arr, c+1, r, max);
            }
        else{
            selection(arr, c+1, r, max);
            }
        }
        else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selection(arr, 0, r-1, 0);
        }

    }
}
