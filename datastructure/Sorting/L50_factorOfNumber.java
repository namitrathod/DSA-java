package Sorting;
import java.util.ArrayList;

public class L50_factorOfNumber {
    public static void main(String[] args) {
        int n =36;
        factor(n);
        factor2(n);
    }
    // Time complexity : O(n);
    static void factor(int n){
        
        for(int i =1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i == i){
                    System.out.println(i+" ");
                }
                else{
                    System.out.print(i+" "+ n/i+" ");
                }
            }
        }
    }
    // Time complexity: O(sqrt(n));
    static void factor2(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i == i){
                    System.out.print(i+" ");
                }
                else{
                    System.out.print(i+" ");
                    list.add(n/i);
                }
            }
        }
        for(int i =list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        } 
    }
}
