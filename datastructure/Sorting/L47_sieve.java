package Sorting;
public class L47_sieve {

    //time complexity is O(N*log(logn))

    
    public static void main(String[] args) {
        int n = 40;
        boolean [] notPrime = new boolean [n+1];
        sieve(n,notPrime);
    }
    public static void sieve(int n,boolean [] notPrime ){
        for(int i=2; i*i<=n;i++){
            if(!notPrime[i]){
                for(int j = i*2;j<=n;j+=i){
                    notPrime[j] =true;
                }
            }
        }

        for(int i =2;i<=n;i++){
            if(!notPrime[i]){
            System.out.print(i+" ");
            }
        }
    }
}