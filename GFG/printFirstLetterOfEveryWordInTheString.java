package GFG;

public class printFirstLetterOfEveryWordInTheString {
    public static String firstAlphabet(String S) {
        String str = "";
                str = String.valueOf(S.charAt(0));
        for(int i = 1; i<S.length()-1; i++){
            if(S.charAt(i) == ' '){
                str+= S.charAt(i+1);
            }
        }
        return str;
    }

    public static void main(String[] args) {
        String str= "bad is good";
        System.out.println(firstAlphabet(str));
    }
}
