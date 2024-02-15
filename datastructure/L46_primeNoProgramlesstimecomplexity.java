public class L46_primeNoProgramlesstimecomplexity {
    public static void main(String[] args) {
        int n = 13;
        for(int i =1;i<=n;i++){
        System.out.println(i+" "+isPrime(i));
        }
    }
    static boolean isPrime(int n){
        if(n<1){
            return false;
        }
        int a =2;
        while(a*a<=n){
            if(n%a==0){
                return false;
            }
            else{
                a++;
            }
        }
        return true;
    }
}
