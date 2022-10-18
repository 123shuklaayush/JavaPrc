public class checkPalindromeString {
    static boolean isPalindrome(String S) {
        StringBuilder str = new StringBuilder();
        str.append(S);

        str.reverse();
        int count = 0;

        for(int i =0;i<S.length(); i++){
            if(S.charAt(i) == str.charAt(i)){
                count++;
            }
        }
        if(count == S.length()){
            return true;
        }


        return false;
    }

    public static void main(String[] args) {
        String S = "Aysh";
        StringBuilder str = new StringBuilder();
            str.append(S);

        str.reverse();
        System.out.println(str);
    }

//        for(int i =0;i<S.length(); i++){
//            if(S.charAt(i) == str.charAt(i)){
//                count++;
//            }
//        }

}
