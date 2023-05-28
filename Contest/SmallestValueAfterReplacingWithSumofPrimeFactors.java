package Contest;

import java.util.*;

public class SmallestValueAfterReplacingWithSumofPrimeFactors {
    public static int smallestValue(int n) {
        while(!isPrime(n)){
            int real = n;
            n = getSumOfPrime(n);
            if(n == real)
                return real;
        }
        return n;
    }
    public static boolean isPrime(int n){
        if(n == 1) return false;
        if(n == 2 || n==3) return true;
        if(n % 2 == 0 || n% 3 == 0) return false;
        for(int i = 5; i*i <=n; i+=6){
            if(n% i == 0 || n% (i+2) == 0)
                return false;
        }
        return true;
    }
    public static int getSumOfPrime(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 2; i*i <=n; i++){
            while(n% i == 0){
                arr.add(i);
                n/=i;
            }
        }
        if(n>1) arr.add(n);
        int sum = 0;
        for(int i = 0; i< arr.size(); i++){
            sum += arr.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 15;
        System.out.println(smallestValue(num));
    }
}
