// package Recursion;
public class L58_concept {
    public static void main(String[] args) {
        fun(5);

    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        // fun(n--);// This will give you stackoverflow error as n value will never change because of post increment operator.
        fun(--n);
    }
    
}
