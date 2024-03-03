package Search;
public class L32_searchInRange {
    public static void main(String[] args) {
        int [] arr = {45,47,6,2,11,66,69,17};
        int target = 69;
        int start = 1;
        int end = 6;
        System.out.println(searchinRange(arr, target, start, end));
    }    
    static int searchinRange(int [] arr, int target, int start , int end){
        if(arr.length == 0){
            return -1;
        }

        for(int i = start; i <= end ; i++){
            int element = arr [i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
