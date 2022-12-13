import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class bufferInput {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a= br.readLine();
        System.out.println(a);
        int d= Integer.parseInt(br.readLine());
        System.out.println(d);


    }
}
