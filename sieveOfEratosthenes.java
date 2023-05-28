import java.util.Arrays;

public class sieveOfEratosthenes {
    public static void sieve(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        for(int i = 2; i*i<=n; i++){
            if(isPrime[i])
                for (int j = i*2; j<=n; j+=i)
                    isPrime[j] = false;
        }
        for(int i = 0; i<=n; i++){
            if(isPrime[i])
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int s = 40;
        sieve(s);
    }
}
