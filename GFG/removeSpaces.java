package GFG;

public class removeSpaces {
    String modify(String S)
    {
        // your code here
        String n= "";
        for(int i = 0; i<S.length(); i++){
            if(S.charAt(i) == ' ' ){
                n += S.charAt(i);
            }
        }
        return n;
    }

}
