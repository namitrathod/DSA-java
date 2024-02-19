public class L61_countNoOfZero {
    public static void main(String[] args) {
        int n =1010340;
        System.out.println(count(n));
        
    }

    // not worked
    static int count=0;

    static int countZero(int n,int count){
        if(n%10==n){
            return n;
        }
        else{
        if(n%10==0){
            return countZero(n/10, count+1);
        }
        else{
            return countZero(n/10, count);
        }

    }
}
// not worked



///////////////////////////////Special Pattern : How to pass a value to above calls ////////////////////////////////////////////////
static int count(int n){
    return helper(n,0);
}
private static int helper (int n,int c){
    if(n==0){
        return c;
    }
    else{
        if(n%10==0){
            return helper(n/10, c+1);
        }
        else{
            return helper(n/10, c);
        }
    }
}

}
