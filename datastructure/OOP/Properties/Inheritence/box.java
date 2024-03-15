

public class box {
    double l;
    double b;
    double h;
    box(){
        this.l =-1;
        this.b =-1;
        this.h =-1;
    }
    box(double side){
        this.l = side;
        this.b = side;
        this.h = side;
    }
    box(double l, double b,double h){
        this.l = l;
        this.b = b;
        this.h = h;
    }
    box(box old){
        this.l = old.l;
        this.b = old.b;
        this.h = old.h;
    }
    public void displayInfo() {
        System.out.println("running the box");
    }
}
