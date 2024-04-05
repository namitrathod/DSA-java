package Sorting;
import java.util.Arrays;

public class L40_sortedmatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,10,15},
            {4,5,12,18},
            {3,6,9,11},
            {7,8,16,19}
        };
        System.out.println(Arrays.toString(search(arr, 19)));
        
    }
    static int[] binarySearch(int [][] matrix, int row, int cStart, int cend, int target) {
        while (cStart<= cend) {
            int mid = cStart + (cend-cStart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row, mid};
            }
            if(matrix[row][mid]>target){
                cend = mid-1;
            }
            if(matrix[row][mid]<target){
                cStart = mid+1;
            }
        }
        return new int[] {-1,-1};
    }
    
    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;
    
        if(rows == 1){
            return binarySearch(matrix, 0,0,cols-1,target);
        }
        int rstart =0;
        int rend =rows-1;
        int cmid = cols/2;

        while (rstart<rend-1) {
            int mid = rstart +(rend-rstart)/2;   
            if(matrix[mid][cmid] == target){
                return new int[] {mid,cmid}; 
            }         
            if(matrix[mid][cmid] < target){
                rstart = mid;
            }         
            else{
                rend = mid;
            }         
        }
            ////// Now two rows are left
            /// check weather the target is in col
        if(matrix[rstart][cmid]== target){
            return new int[]{rstart,cmid};
        }
        if(matrix[rstart+1][cmid]== target){
            return new int[]{rstart,cmid};
        }

        // search for 1 half 
        if(target<=matrix[rstart][cmid-1]){
            return binarySearch(matrix, rstart, 0, cmid-1, target);
        }
        // search for 2 half 
        if(target>=matrix[rstart][cmid+1]){
            return binarySearch(matrix, rstart, cmid+1, cols-1, target);
        }        
        // search for 3 half 
        if(target<=matrix[rstart+1][cmid-1]){
            return binarySearch(matrix, rstart+1, 0, cmid-1, target);
        }
        // search for 4 half 
        else{
            return binarySearch(matrix, rstart+1, cmid+1, cols-1, target);
        }

    }
}
