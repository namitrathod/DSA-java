import java.util.Arrays;

public class L41_bubbleSort {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int ans[] = bubbleSort(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] bubbleSort(int arr[]){
        for(int i =0; i<arr.length; i++){
            boolean swaped = false;
            for(int j=1; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                swaped = true;
               }
            }
            if(!swaped){
                break;
            }
        }
        return arr;
    } 
}
