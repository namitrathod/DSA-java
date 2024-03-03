package Recursion;
public class L56_sumOfDigit {
    public static void main(String[] args) {
        int n = 1245;
        System.out.println(sumofdigit(n));
    }
    static int sumofdigit(int n){
        if(n==0){
            return 0;
        }
        int r= n%10;
        return r+sumofdigit(n/10);


    }
}
