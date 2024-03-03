package Intro;


import java.util.Scanner;

public class L10_switchCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch(fruit){
            case "Mango":
                System.out.println("King of fruit");
                break;
            case "Apple":
                System.out.println("Good for health");
            case "Orange":
                System.out.println("Round fruit");
            case "Grapes":
                System.out.println("small fruit");
            default:
                System.out.println("Please enter a valid fruit");
        }
/////////////////////////////////////////////////////////////////////New syntax
        switch(fruit){
            case "Mango" -> System.out.println("king of fruit");
            case "Grapes" -> System.out.println("king of fruit");
            case "Apple" -> System.out.println("king of fruit");
            case "Orange" -> System.out.println("king of fruit");
            default -> System.out.println("please enter a valid Fruit");}
/////////////////////////////////////////////////////////////////////////////////////
int day=1;
switch (day) {
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
        System.out.println("weekday");
        break;
    case 6:
    case 7:
        System.out.println("weekend");
    default:
        break;
}
////////// new syntax////////////////////////////////////./////////////////////////

switch(day){
    case 1,2,3,4,5 -> System.out.println("weekday");
    case 6,7 -> System.out.println("weekend");
}

//////////////////^^^^ new syntax has break statement default^^^

        
    }
}
