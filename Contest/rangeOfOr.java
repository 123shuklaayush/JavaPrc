package Contest;

public class rangeOfOr {
    public static int rangeOR(int n){
        String str = Integer.toString(n);
        String binNum = Integer.toBinaryString(n);
        int len = binNum.length();
        StringBuilder sb = new StringBuilder();
        sb.append(1);
        for(int i = 0; i< len-1; i++){
            sb.append(0);
        }
        String num = sb.toString();
        int decNum = Integer.parseInt(num, 2);
        return decNum|decNum-1;
    }

    public static void main(String[] args) {
        System.out.println(rangeOR(1));
    }
}
