package Assignments;
import java.lang.Math.*;

import java.util.Scanner;

public class A1_1_CurvedSurfaceAreaOfCylinder {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the base radius and Height");
        int radius = in.nextInt();
        int height = in.nextInt();
                // Consume the newline character left in the buffer
                in.nextLine();
        System.out.println("enter the unit");
        String unit = in.nextLine();

        double area = 2* Math.PI*height*radius; // was not working when double was not used
        // String areaUnit = unit;

        System.out.println(area +" "+ unit+"\u00B2" +"is the Curved Surface Area Of Cylinder");

    }
}
