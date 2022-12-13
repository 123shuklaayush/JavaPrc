package SlidingWindow;

public class smallestWindowInAStringContainingAllTheCharactersOfAnotherString {
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] str = s.trim().split("\\s+");
        for(int i = str.length-1; i>0; i--){
            sb.append(str[i] + " ");
        }
        return sb.toString() + str[0];
    }

    public static void main(String[] args) {
        String s = "   hello    world      ";
        String[] parts = s.trim().split("\\s+");
        System.out.print(reverseWords(s));

    }
}
