package SlidingWindow;

import java.util.HashMap;

public class countOccurencesOfAnagrams {
    public static int count(String str, String s2, int k){
        HashMap<String,Integer> m1= new HashMap<>();
        HashMap<String, Integer> m2 = new HashMap<>();
        int num=0;
        for(int i = 0; i< str.length(); i++){
            if(m1.containsKey(str.charAt(i))){
                m1.put(String.valueOf(str.charAt(i)), m1.get(str.charAt(i)) + 1);
            }
            else{
                m1.put(String.valueOf(str.charAt(i)), 1);
            }
        }
        int i = 0, j=0;
        while(j<str.length()){

            //Calculations

            if(j-i+1 <k){
                j++;
            }

            else if (j-i+1==k) {
//                Answer from the Calculaion
            }

        }
        return num;
    }
}
