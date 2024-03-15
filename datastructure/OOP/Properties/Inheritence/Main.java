

public class Main {
    public static void main(String[] args) {
        box box1 = new box();
        System.out.println(box1.l+" " + box1.b+" "+ box1.h);

        boxWeight box3 = new boxWeight();
        boxWeight box4 = new boxWeight(2,3,4,8);
        System.out.println(box4.h+" "+ box4.l+" " + box4.weight);

        box box5 = new boxWeight(2,3,4,8);   // Parrent refference variable and child object
        //System.out.println(box5.w); // error
        System.out.println(box5.l); 

        //boxWeight box6 = new box(2,3,4,5);        // showing error because child reffernece variable can not be defined to
                                                  // parent object.

    }
}
