// package datastructure;
import java.util.Scanner;

public class L7_countingRepeatation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rep = in.nextInt();
        int num = 1234343;
        int count =0;
        while(num>0){
        int remainder = num%10;
        if(remainder == rep) {
            count++;
        }
        else{}
        int quotient = num/10;
        num = quotient;
    }
        System.out.println(count);
    }
}
