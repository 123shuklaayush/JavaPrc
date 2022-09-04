package Recursion;

public class appendTheX {
    public static void addX(String str, int idx){
        int count = 0;
        String newString = "";
        if(idx == str.length()){
//            for(int i = 0;i <count; i++){
//                newString += 'x';
//            }
            System.out.println(newString);
            return;
        }
        char currElement = str.charAt(idx);
        if(currElement == 'x'){
            count++;
            addX(str, idx+1);
        }
        else{
            newString += currElement;
            addX(str, idx+1);
        }
    }

    public static void main(String[] args) {
        String str = "aysxdx";
        addX(str, 0);

    }
}
