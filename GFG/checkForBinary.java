package GFG;

public class checkForBinary {
    public static boolean isBinary(String str)
    {
        //Your code here
        for(int i =0; i<str.length(); i++) {

            if (str.charAt(i) == 0 || str.charAt(i)==1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "0";
        boolean b= isBinary(str);
        System.out.println(b);
    }
}
