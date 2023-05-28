package Strings;

public class capitalizeLetterInSentences {
    public static String capitalizeTitle(String title) {
        String s = title.toLowerCase();
        String[] str = s.split("\\s");
        StringBuilder sb = new StringBuilder();
        for(int i =0; i< str.length; i++){
            if(str[i].length() > 2){
                String firstLetter = str[i].substring(0,1);
                firstLetter = firstLetter.toUpperCase();
                String exclude = str[i].substring(1,str[i].length());
                str[i] = firstLetter + exclude;
            }
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i< str.length-1; i++){
            ans.append(str[i]);
            ans.append(" ");
        }
        return ans.toString() + str[str.length-1];
    }

    public static void main(String[] args) {
        String str = "Hello, the people of india, nice to meet you";
        System.out.println(capitalizeTitle(str));
    }
}
