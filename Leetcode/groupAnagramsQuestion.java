package Leetcode;
import java.util.*;
public class groupAnagramsQuestion
{
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s: strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            if (!map.containsKey(sorted))
                map.put(sorted, new ArrayList<String>());
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());

    }
        public static void main(String[] args) {
            String[] str = {"cat", "dog", "god", "silence", "listen", "act"};
            System.out.println(groupAnagrams(str));

        }
}
