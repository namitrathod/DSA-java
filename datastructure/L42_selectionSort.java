import java.util.Arrays;

public class L42_selectionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        for(int i=0; i<arr.length;i++){
            int last = arr.length-1-i;
            int maxindex = maxvalue(arr, 0,last);

            swap(arr,maxindex,last);
        }
    }

    static int maxvalue(int[] arr, int start,int end){
        int max = start;
        for(int i =start;i<=end;i++){
            if(arr[max]<arr[i]){
                max =i;
            }
        }
        return max;
    }
    
    static void swap(int arr[],int first, int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }
}
