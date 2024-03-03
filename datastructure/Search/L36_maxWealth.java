package Search;
public class L36_maxWealth{
    public static void main(String [] args){
        int [][] arr = {
                        {1,2,3},
                        {9,1,6},
                        {3,3,7},
                            };
        int richest = maxWealthwithenhancedaForloop(arr);
        System.out.println(richest);
    }

    static int maxWealth(int[][] arr){
        int maxWealth =0;
        for(int people=0; people < arr.length; people++){
            int personmaxwealth =0;
            for(int wealth =0; wealth < arr[people].length;wealth++){
                personmaxwealth = personmaxwealth+ arr[people][wealth];
            }
            if(personmaxwealth>maxWealth){
                maxWealth = personmaxwealth;
            }
        }
        return maxWealth;
    }
    static int maxWealthwithenhancedaForloop(int[][] arr){
        int maxWealth =0;
        for(int [] people: arr){
            int personmaxwealth =0;
            for(int wealth : people){
                personmaxwealth = personmaxwealth+ wealth;
            }
            if(personmaxwealth>maxWealth){
                maxWealth = personmaxwealth;
            }
        }
        return maxWealth;
    }
}