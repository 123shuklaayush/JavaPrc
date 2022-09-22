public class sumOfSubArrays {

    public static void main(String[] args) {
//        Finding Sum
//      for  1, 2, 3
//        1---1
//        1 2---3
//        1 2 3---6
//        2---2
//        2 3---5
//        3---3
//        Total--- 20

        int[] arr = {1, 2, 3};
        int sum = 0;
        int finSUm = 0;
        int n = arr.length;
        for(int i =0; i< arr.length; i++){
//            for(int j = 0; j<arr.length; j++){
//                sum += arr[i];
//                finSUm+=sum;
//            }
            // Optimised Code
            sum+=  ((n-i)*(i+1)*arr[i])%100000007;
        }
        System.out.println(sum);
    }
    }