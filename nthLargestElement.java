import java.util.PriorityQueue;

public class nthLargestElement
{
    public static int nthLargestNumber(int[] arr, int n){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i< n; i++) pq.add(arr[i]);
        for(int i = n ;i< arr.length; i++){
            if(pq.peek() < arr[i]) {
                pq.remove();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 8, 0, 3};
        System.out.println(nthLargestNumber(arr, 4));
    }
}
