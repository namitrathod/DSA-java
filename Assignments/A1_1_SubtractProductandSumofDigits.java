package Assignments;

import java.util.Scanner;

public class A1_1_SubtractProductandSumofDigits
    {
        public static void main(String[] args) {
            
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int num= n;
            int num1= n;
            int pd = 1;
            
            while(num>1){
                //    int num =n;
                // pd = pd*num%10;     this caused issue because First pd*num was done then %10 was performed.
                pd *= num%10;
                num = num/10;
                
            }
            
        int sum =0;
        
        while(num1>0){
            // int num =n;
            sum  += num1%10;
            num1 = num1/10;
        }
        
        int result = pd-sum;
        System.out.print(result);
        
    }
    }