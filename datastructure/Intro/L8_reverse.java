package Intro;
// package datastructure;
import java.util.Scanner;

public class L8_reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int reverse = 0;
        while(num>0){

            int remainder = num % 10;
            reverse = 10*reverse + remainder;
            num = num/10;
        }
        System.out.println(reverse);


    }
}
