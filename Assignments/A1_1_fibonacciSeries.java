package Assignments;

import java.util.Scanner;

public class A1_1_fibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int term = in.nextInt();
        int a =0;
        int b =1;

        for(int i=2; i<=term; i++){
            int temp = b;
            b = a+b;
            a = temp;
        }
        System.out.println(b + " is the " + term + " of the series");
    }
    
}
