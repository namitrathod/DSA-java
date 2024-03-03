package Intro;
import java.util.Scanner;

public class L19_armstrongnumber {
    public static void main(String[] args) {

        // below code can be uncommented if for loop is not used 
        // Scanner in = new Scanner(System.in);
        // int input = in.nextInt();                       
        // System.out.println(isarmstrong(input));

        for(int i=100; i<1000;i++){
            if(isarmstrong(i)){
                System.out.print(i+" ");
            }
        }
    }
    static boolean isarmstrong(int n){
        int original = n;
        int sum = 0;
        while (n>0) {
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }
        // if(sum==original){
        //     return true;
        // }
        // else{
        //     return false;
        // }
       //  below code is shortcode

       return sum == original;
    }

}
