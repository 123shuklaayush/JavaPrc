public class sumOfTwoNumbersWithoutUsingOperators {
    public static int getSum(int p, int q){
        int carry=0, result =0;
        for(int i=0; i<32; i++)
        {
            int n1 = (p & (1<<(i)))>>(i); //find the nth bit of p
            int n2 = (q & (1<<(i)))>>(i); //find the nth bit of q

            int s = n1 ^ n2 ^ carry; //sum of bits
            carry = (carry==0) ? (n1&n2): (n1 | n2); //calculate the carry for next step
            result = result | (s<<(i)); //calculate resultant bit
        }

        return result;
    }

    public static void main(String[] args) {
        int a = 7;
        int b = 55;
        System.out.println(getSum(a, b));
    }
}
