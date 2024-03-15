
public class boxWeight extends box {
    double weight;
    public boxWeight() {
        // super();
        this.weight=-1;
    }
    public boxWeight(double l,double b, double h, double weight){
        super(l,h,b);
        this.weight = weight;
    }

}
