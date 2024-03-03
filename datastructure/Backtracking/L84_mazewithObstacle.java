package Backtracking;
public class L84_mazewithObstacle {
    public static void main(String[] args) {
        boolean[][] boad ={
            {true,true, true},
            {true,false, true},
            {true,true, true},
        };
        mazepath("", boad, 0 , 0);
        
    }
    static void mazepath(String p,boolean [][] maze, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            mazepath(p+'D',maze, r+1, c);
        }
        if(c<maze[0].length-1){
            mazepath(p+'R',maze, r, c+1);
        }
    }
}
