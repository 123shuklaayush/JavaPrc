package GFG;

public class countOfCamelCase
{
   static int countCamelCase (String s)

    {

        int n = s.length();

        int count=0;

        for(int i=0;i<n;i++){

            if(s.charAt(i)>=65 && s.charAt(i)<=90){
                count++;
            }

        }

        return count;

    }

    public static void main(String[] args) {
        String a = "SLRJ Awdlfj sfd f";
        System.out.println(countCamelCase(a));
    }
}
