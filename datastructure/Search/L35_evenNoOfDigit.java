package Search;
public class L35_evenNoOfDigit {
    public static void main(String[] args) {
        int [] nums = new int[] {18,124,9,1764,98,1,-45};
        System.out.println(findNumber(nums)); 
        
    }
    static int findNumber(int [] num){
        int count = 0;
        for(int nums : num){
            if(even(nums)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int nums) {
        int count = digits(nums);
        return count%2==0;
    }
    static int noOfDigits(int nums){

        // to make it work for negative values
        if(nums<0){
            nums = nums*-1;
        }
/////////////////// when number is 0 case
        if(nums==0){
            return 1;
        }


        int count =0;
        while (nums>0) {
            count++;
            nums = nums/10;
        }
        return count;
    }

    ///////////////////////////////////////////////////////////// Shortcut for number of digit
    static int digits(int num){
        if(num<0){
            num = num*-1;
        }
        return (int)(Math.log10(num)+1);
    }
    
}
