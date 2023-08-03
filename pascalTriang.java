import java.util.*;

public class pascalTriang {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i< numRows; i++){
            List<Integer> temp = new ArrayList<>();
            temp = getRow(i);
            list.add(new ArrayList<>(temp));
        }
        return list;
    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        long ans =1;
        list.add(1);
        int row= rowIndex +1;
        for(int i = 1; i< rowIndex ; i++){
            ans = ans * (row- i);
            ans = ans/i;
            list.add((int)ans);
        }
        if(rowIndex == 0)
            return list;
        list.add(1);
        return list;
    }
}
