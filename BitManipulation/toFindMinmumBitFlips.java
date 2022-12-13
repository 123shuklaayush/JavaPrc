package BitManipulation;

public class toFindMinmumBitFlips {
    public static int minBitFlips(int start, int goal) {
        int numOfOnes = start ^ goal;
        int count = 0;
        while(numOfOnes !=0){
            numOfOnes= numOfOnes>>1;
            if(numOfOnes == 1)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 7;
        System.out.println(minBitFlips(a, b));
    }
}
