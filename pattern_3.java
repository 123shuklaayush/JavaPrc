public class pattern_3 {
    public static void main(String[] args) {
        for(int i= 1; i<=5; i++){
            for(int j = 4; j>=i; j--){
                System.out.print(" ");
            }
            for(int k = 0; k<i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i<5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(" ");
            }
            for(int k = 5; k>i; k--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
