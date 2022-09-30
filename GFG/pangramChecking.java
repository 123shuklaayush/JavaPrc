package GFG;

import java.util.HashSet;

public class pangramChecking {
    public static boolean checkPangram (String str) {
        if(str.length() <26){
            return false;
        }
        str = str.toLowerCase();
        HashSet<Character> h = new HashSet<>();
        for(int i = 0; i< str.length(); i++){
            if(str.charAt(i)>= 'a' && str.charAt(i) <='z'){
                h.add(str.charAt(i));
            }
            if(h.size() ==26)
                return true;
        }
        return false;
    }
}
