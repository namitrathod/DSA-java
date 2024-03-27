// package Recursion;
public class L57_ProductOfDigits {
    public static void main(String[] args) {
        int n = 505;
        System.out.println(Productofdigit(n));
    }
    static int Productofdigit(int n){
        if(n%10==n){
            return n;
        }
        int r= n%10;
        return r*Productofdigit(n/10);


    }
}
