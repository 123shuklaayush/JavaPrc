package DP;
import java.util.*;
public class triangle {
    public static int minimumTotal(List<List<Integer>> triangle) {
        int height = triangle.size();
        int[][] dp = new int[height+1][height+1];
        int min = Integer.MAX_VALUE;
        for(int level = height-1; level >= 0; level--){
            for(int i = 0; i<= level; i++){
                dp[level][i] = Math.min(dp[level+1][i+1], dp[level+1][i])
                        + triangle.get(level).get(i);
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        List<List<Integer>> twoDList = new ArrayList<>();

        twoDList.add(new ArrayList<Integer>() {{
            add(2);
        }});

        twoDList.add(new ArrayList<Integer>() {{
            add(3);
            add(4);
        }});

        twoDList.add(new ArrayList<Integer>() {{
            add(6);
            add(5);
            add(7);
        }});

        twoDList.add(new ArrayList<Integer>() {{
            add(4);
            add(1);
            add(8);
            add(3);
        }});
        System.out.println(minimumTotal(twoDList));
    }
}
