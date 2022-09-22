import java.util.HashMap;

public class checkAnagrams {
//    listen and silence are anagrams as they've equal number of length and contains same character
    public static boolean anagrams(String s1, String s2){
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        if(s1.length() != s2.length()){
            return false;
        }

        else {
            for(int i = 0; i< s1.length(); i++){
                Character ch;
                ch = s1.charAt(i);
                if(map1.containsKey(ch)){
                    map1.put((ch), map1.get(ch) + 1);
                }
                else{
                    map1.put((ch), 1);
                }
            }
            for(int i = 0; i< s2.length();i++){
                Character ch;
                ch = s2.charAt(i);
                if(map2.containsKey(ch)){
                    map2.put(ch, map2.get(ch)+1);

                }
                else{
                    map2.put(ch, 1);
                }
            }
        }
        return map1.equals(map2);
    }

    public static void main(String[] args) {
        String s1 = "silen";
        String s2 = "lisen";
        System.out.println(anagrams(s1, s2));
    }
}
