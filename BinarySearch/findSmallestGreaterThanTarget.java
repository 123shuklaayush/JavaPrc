package BinarySearch;

public class findSmallestGreaterThanTarget {
    public static char nextGreatestLetter(char[] letters, char target) {
        int i = 0;
        int j = letters.length-1;
        char res = letters[0];
        while( j >= i ){
            int mid = i + (j-i)/2;
            if(letters[mid] == target) i = mid+1;
            else if ( letters[mid] > target ){
                res = letters[mid];
                j = mid-1;
            }
            else if( letters[mid] < target){
                i = mid +1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        char[] c = {'c','f','j'};
        System.out.println(nextGreatestLetter(c, 'g'));
    }
}
