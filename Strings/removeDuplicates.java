package Strings;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicates {
    public static StringBuilder removeDups(String s){
        Set<String> news = new HashSet<>();
        StringBuilder builder = new StringBuilder();
        for(int i =0; i< s.length() ; i++){
            news.add(String.valueOf(s.charAt(i)));
        }
        for(String str:news){
            builder.append(str);
        }
        return builder;

    }

    public static void main(String[] args) {
        System.out.println(removeDups("vsxs"));
    }
}
