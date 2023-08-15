package Recursion;
import java.util.*;
public class palindromeParitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        helper(s, ans, 0, new ArrayList<>());
        return ans;
    }
    public void helper(String s, List<List<String>> ans, int idx, List<String> ip){
        if( idx == s.length() ){
            ans.add(new ArrayList<>(ip));
            return;
        }
        for(int i = idx; i< s.length(); ++i){
            if(isPalindrome(s, idx, i)){
                ip.add(s.substring(idx, i+1));
                helper(s, ans, i+1, ip);
                ip.remove(ip.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s, int start, int end){
        while(start <= end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
