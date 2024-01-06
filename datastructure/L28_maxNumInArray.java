public class L28_maxNumInArray {
    public static void main(String[] args) {
        int [] arr = {1,5,10,3,19,8};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int max =arr[0];
        int i=0;
        while(i<arr.length){
            if(max<arr[i]){
                max = arr[i];
            }
            i++;
        }
        return max;
    }
}