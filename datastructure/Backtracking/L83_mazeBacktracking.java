package Backtracking;
public class L83_mazeBacktracking {
    
    public static void main(String[] args) {
        System.out.println(maze(3, 3));
        mazepathdigonal("", 3, 3);
        
    }
    static int maze(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int left= maze(r-1, c);
        int right = maze(r, c-1);
        return right+left;
    }
    static void mazepath(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            mazepath(p+'D', r-1, c);
        }
        if(c>1){
            mazepath(p+'R', r, c-1);
        }
    }
    static void mazepathdigonal(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            mazepathdigonal(p+'V', r-1, c);
        }
        if(c>1){
            mazepathdigonal(p+'H', r, c-1);
        }
        if(r>1 && c>1){
            mazepathdigonal(p+'D', r-1, c-1);
        }
    }
}
