// package datastructure;
import java.util.Scanner;

public class L4_largestNumber {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();

        // int max = a;

        // if(b>max){
        //     max = b;
        // }
        // else{}

        // if(c>max){
        //     max = c;
        // }
        // else{}
        // System.out.println(max);
        
        
        /////////////////////////////////////another way
        
        // int max = 0;
        // if (a>b){
        //     max = a;
        // }else{
        //     max=b;
        // }
        // if(c>a){
        //     max = c;
        // }
        // System.out.println(max);



        ////////////////////////////////////////math.max function

        System.out.println(Math.max(a,Math.max(a, b)));
    }
}
