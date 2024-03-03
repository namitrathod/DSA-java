package Search;
import java.util.Arrays;

public class L34_searchIn2Darray {
    public static void main(String[] args) {
        int [][] arr = {
            {1,5,9,8},
            {7,6,4},
            {10,14,3,0},
        };
        int target = 14;
        int[] ans = search(arr, target);          // observe
        System.out.println(Arrays.toString(ans));                  // these two lines of code
        System.out.println(max(arr));
        System.out.println(maxUsingEnhancedFOrloop(arr));
    }

     static int[] search(int[][] arr, int target) {   // returning array 
        for(int row=0;row <arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[] {-1,-1};    
    }
     static int max(int[][] arr) {   
        int max =Integer.MIN_VALUE;
        for(int row=0;row <arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col] > max){
                    max = arr[row][col];
                    
                }
            }
        }
        return max;    
        }

        //////////////////////////// Using enhanced for loop
     static int maxUsingEnhancedFOrloop(int[][] arr) {   
        int max =Integer.MIN_VALUE;
        for(int [] arra : arr){
            for(int element : arra){
                if(element > max){
                    max = element;
                }
            }
        }
        return max;    
    }
}
