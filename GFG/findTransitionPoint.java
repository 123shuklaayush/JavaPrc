package GFG;

public class findTransitionPoint {
    static int transitionPoint(int arr[], int n) {
        for(int i=0; i<n ; i++){
            if(arr[i]==1){
                return i;
            }}
        return -1;
    }
        public static void main(String[] args) {
        int[] arr = {0,0,1,1};
        System.out.println(transitionPoint(arr, arr.length));
    }
}
