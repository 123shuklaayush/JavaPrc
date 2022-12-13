
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.lang.reflect.Array;
import java.util.*;
public class driver3 {

    public static void main(String[] args) {
        String num = "1011";
        int binNum = Integer.parseInt(num);
        int k = 4;
        System.out.println(2<<k);
        System.out.println(Integer.toBinaryString(42));
        int um = 16;
        int count = 0;
        while(um !=0){
            count++;
            um = um & (um -1);
        }
        int n = 3;
        int x = 1;
        System.out.println(Math.pow(2, 5));
        System.out.println(Math.ceil(30.34902));
        System.out.println(Math.abs(400-40));

    }


}
