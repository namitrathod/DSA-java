package Backtracking;
public class L85_mazeProblemWithbacktracking {
    public static void main(String[] args) {
        boolean[][] arr ={
            {true,true, true},
            {true,true, true},
            {true,true, true},
        };
        maze("", arr, 0, 0);
        
    }
    static void maze(String p,boolean[][] arr,int r,int c){
        if(r==arr.length-1 && c == arr[0].length-1){
            System.out.println(p);
            return;
        }
        if(!arr[r][c]){
            return;
        }
        // i am considering this block in my path
        arr[r][c]  =false;

        if(r<arr.length-1){
            maze(p+'D', arr, r+1, c);
        }
        if(c<arr[0].length-1){
            maze(p+'R', arr, r, c+1);
        }
        if(r>0){
            maze(p+'U', arr, r-1, c);
        }
        if(c>0){
            maze(p+'L', arr, r, c-1);
        }

        // this line is where the function will be over
        // So, before the function gets remove, also remove the change that were made
        arr[r][c] = true;
    }
}
