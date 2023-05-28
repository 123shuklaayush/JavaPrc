public class alternateDigitSum {
    public static int alternateDigit(int n) {
       String s = Integer.toString(n);
       char[] c = s.toCharArray();
       int sum = 0;
       int diff = 0;
       for(int i = 0; i< c.length; i+=2){
           sum += (int)c[i] - '0';
       }
        for(int i = 1; i< c.length; i+=2){
            diff -= (int)c[i] - '0';
        }
        int ans = sum + diff;

        return ans;
    }

    public static void main(String[] args) {
        int n = 886996;
        System.out.println(alternateDigit(n));
    }
}
