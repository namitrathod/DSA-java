package Pattern;

public class Question31 {
    public static void main(String[] args) {
        pattern31(4);
    }

    static void pattern31(int n){
        for(int row=0;row<=2*n;row++){
            if(row==4 || row ==5){
                
            }else{

                for(int col=0;col<=2*n;col++){
                    int atEveryIndex=n-Math.min(Math.min(row, col), Math.min(2*n-row,2*n-col));
                    System.out.print(atEveryIndex +" ");
                }
                System.out.println();
            }
        }
    }
}
