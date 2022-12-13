package BitManipulation;

public class toFindKthBit {
    static boolean checkKthBit(int binNum, int k)
    {
        if(((1<<k) & binNum) == 0)
            return false;
        return true;

    }

    public static void main(String[] args) {
        int n = 500;
        int k = 3;
        System.out.println(checkKthBit(n, k));
    }
}
