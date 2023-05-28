package Recursion;

public class removeaFromString {
    public static String removeA(String str, int idx){
        StringBuilder sb = new StringBuilder();
        if(str.length() == idx)
            return sb.toString();
        if(str.charAt(idx) != 'a')
            sb.append(str.charAt(idx));
        StringBuilder s =  new StringBuilder(removeA(str, idx + 1));
        sb.append(s);
        return sb.toString();
    }
    public static String skipApple(String str){
        if(str.isEmpty())
            return "";
        if(str.startsWith("apple"))
            return skipApple(str.substring(5));
        else
            return str.charAt(0) + skipApple(str.substring(1));
    }

    public static void main(String[] args) {
        String str= "bapplebcappled";
        System.out.println(removeA(str, 0));
        System.out.println(skipApple(str));
    }
}
