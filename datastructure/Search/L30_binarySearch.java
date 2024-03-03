package Search;
public class L30_binarySearch {
    public static void main(String [] args) {
        int [] arr = {55,56,46,10,40,59,27,69};
        int target = 68;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
        System.out.println(linearSearchwithelement(arr, target));
    }
    // search in an array : return the index if item found.
    // otherwise return -1;
    static int linearSearch(int [] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        for(int i =0; i<arr.length; i++){
            // check for every index whether it is equal to the target or not
            if (arr[i]==target){
                return i;
            } 
        }
        return -1;
    }

    static int linearSearchwithelement(int [] arr, int target){
        if(arr.length == 0){
            return -1;
        }///////////////////////// enhanced for loop
        for(int element : arr){
            if(element == target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }

    
}
