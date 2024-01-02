// package datastructure;
import java.util.Scanner;

public class L1_io_program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the roll no");
        int rollno =input.nextInt();
        System.out.println("the roll no is "+ rollno);


        Scanner input2 = new Scanner(System.in);
        String name = input2.nextLine();
        // String name = input2.next();
        System.out.println(name + " is my name");

        Scanner input3 = new Scanner(System.in);
        float mark = input.nextFloat();
        System.out.println(mark + " is my score"); 


    }
    
}
