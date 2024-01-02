import java.util.Scanner;

public class L11_Nested_switch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String department = in.next();

        switch (empId) {
            case 1:
                System.out.println("Kunal kushwaha");
                break;
            case 2:
                System.out.println("Namit Rathod");
                switch(department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "management":
                        System.out.println("managerial department");
                        break;
                    default :
                        System.out.println("no department selected");
                }
                break;
            default:
                System.out.println("enter the correct emp ID");
                break;
        }
    }
    
}
