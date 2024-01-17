import java.util.Arrays;

public class L39_binarySearch2Darray {
    public static void main(String[] args){
        int [][] arr = {
                          {12,24,36,48},
                          {15,27,33,41},
                          {11,29,31,49},
                          {18,21,38,43},
                            };
        int target = 49;
        System.out.println(Arrays.toString(search(arr, target)));
    }
    static int[] search(int[][] matrix, int target){
        int r =0;
        int c = matrix.length-1;

        while (r<matrix.length && c>=0) {
            if(matrix[r][c]==target){
                return new int [] {r,c};
            }
            if(matrix[r][c]>target){
                c--;
            }
            if(matrix[r][c]<target){
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}
