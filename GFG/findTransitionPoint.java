package GFG;

public class findTransitionPoint {
    int transitionPoint(int arr[], int n) {
        // code here
        int k = arr[0];
        if(arr.length ==1){
            return 1;
        }
        for(int i= 0;i<n; i++){
            if(k!=arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1};
        System.out.println(transitionPoint(arr, arr.length));
    }
}
