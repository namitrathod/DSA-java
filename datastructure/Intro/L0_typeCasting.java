package Intro;
// package datastructure;
import java.util.Scanner;

public class L0_typeCasting {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        float number = input.nextFloat();
        System.out.println(number);

        // type casting
        int num = (int)(67.56f);
        System.out.println(num);
        
        //automatic type promotion in expression
        int a = 257;
        byte b = (byte)(a);// 257%256 = 1
        System.out.println(b);

        byte c = 40;
        byte d = 50;
        byte e = 100;
        int f = c*d/e;   // this expression C*d/e is done after conversing it into int.
        System.out.println(f);

        // byte g =50;
        // g = g*2;  this shows error because it while operation g was converted to int

        // the bytes short and char values 

// >>>>>>>>>>>>>>>>>>Type promotion in Expressions>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

// While evaluating expressions, the intermediate value may exceed the range of operands and hence the expression
// value will be promoted. Some conditions for type promotion are:
// Java automatically promotes each byte, short, or char operand to int when evaluating an expression.
// If one operand is a long, float or double the whole expression is promoted to long, float or double respectively.

    
    }
    
}
