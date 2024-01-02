package Assignments;

import java.util.Scanner;

public class A1_1_parameterOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the length"); 
        int length = in.nextInt();
        System.out.println("enter the breadth"); 
        int breadth = in.nextInt();

        int paramter = 2*(length + breadth);

        System.out.println(paramter);
    }
}
