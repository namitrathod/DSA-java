package Backtracking;
import java.util.Arrays;

public class L86_mazePrintMartixAndPath {
    public static void main(String[] args) {
        boolean[][] arr ={
            {true,true, true},
            {true,true, true},
            {true,true, true},
        };
        int [][] path = new int[arr.length][arr[0].length];
        maze("", arr, 0, 0, path, 1);
    }
    static void maze(String p,boolean[][] arr,int r,int c,int[][] path, int step){
        if(r==arr.length-1 && c == arr[0].length-1){
            path[r][c]= step;
            for(int[] ar : path){
                System.out.println(Arrays.toString(ar));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!arr[r][c]){
            return;
        }
        // i am considering this block in my path
        arr[r][c]  =false;
        path[r][c]= step;

        if(r<arr.length-1){
            maze(p+'D', arr, r+1, c,path, step+1);
        }
        if(c<arr[0].length-1){
            maze(p+'R', arr, r, c+1,path, step+1);
        }
        if(r>0){
            maze(p+'U', arr, r-1, c,path, step+1);
        }
        if(c>0){
            maze(p+'L', arr, r, c-1,path, step+1);
        }

        // this line is where the function will be over
        // So, before the function gets remove, also remove the change that were made
        arr[r][c] = true;
        path[r][c]= 0;
    }
}
