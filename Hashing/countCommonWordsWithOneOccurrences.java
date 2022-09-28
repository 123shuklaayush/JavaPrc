package Hashing;
import java.util.*;
public class countCommonWordsWithOneOccurrences {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        int count = 0;
        // Entering words1 Element in map1
        for(int i = 0; i< words1.length ;i++){
            if(map1.containsKey(words1[i])){
                map1.put(words1[i], map1.get(words1[i])+1);
            }

            else{
                map1.put(words1[i], 1);
            }
        }

        // Entering words2 Element in map2
        for(int i = 0; i< words2.length ;i++){
            if (map2.containsKey(words2[i])) {
                map2.put(words2[i], map2.get(words2[i])+1);
            } else {
                map2.put(words2[i], 1);
            }
        }

        for(Map.Entry<String, Integer> e : map2.entrySet()){
            if(e.getValue()==1){
                count++;
            }
        }
        return count;

}

    public static void main(String[] args) {

    }
}
