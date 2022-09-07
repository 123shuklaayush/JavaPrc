package Hashing;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public class hashSet {
    public static void main(String[] args) {
//        Creating HashSet
        HashSet<Integer> set = new HashSet<>(); // Quite Similar to ArrayList
//        ArrayList<Integer> arr = new ArrayList<>();
        //insert
        set.add(0);
        set.add(49);
        set.add(03);
        set.add(20);
        set.add(12);
        System.out.println(set);

//        Searching
        System.out.println(set.contains(4));

//        Deleting
        set.remove(1);
        set.add(1);
        System.out.println(set);

//        Size
        System.out.println(set.size());

//        Iterator
        Iterator<Integer> it = set.iterator();
//        System.out.println(it);
        while(it.hasNext()){
            System.out.print(it.next() + "  ");
        }
    }
}
