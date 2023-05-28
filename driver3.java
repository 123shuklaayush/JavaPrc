import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class driver3 {
    static ArrayList<String> permutation(String S){
        // Code Here
        ArrayList<String> arr = new ArrayList<>();
        String input = S;
        String output = "";
        output += (S.charAt(0));
        input =input.substring(1);
        helper(arr, output, input);
        return arr;
    }
    static void helper(ArrayList<String> arr , String output, String input){
        if(input.isEmpty()){
            arr.add(output);
            return;
        }
        String op1 = output + input.charAt(0);
        String op2 = output + " " +  input.charAt(0) ;
        input = input.substring(1);
        helper(arr, op1, input);
        helper(arr, op2, input);
    }
    public static void main(String[] args) {
        System.out.println(permutation("abc"));
    }
}

