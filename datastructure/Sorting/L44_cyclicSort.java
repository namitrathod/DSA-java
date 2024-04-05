package Sorting;
import java.util.Arrays;

public class L44_cyclicSort {
    public static void main(String[] args) {
        int[] arr = {2,3,1,5,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr){
        int i = 0;
        while (i<arr.length) {
            if(i == arr[i]-1){
                i++;
                // I used break here which resulted in breaking the while condition
            }
            else{
                swap(arr,i,arr[i]-1);
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
