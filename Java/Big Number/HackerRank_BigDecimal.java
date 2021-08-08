import java.math.BigDecimal;
import java.util.*;
class HackerRank_BigDecimal{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

        //Write your code here
        Arrays.sort(s, new Comparator<String>(){
            public int compare(String s1, String s2) {
                if (s1 == null || s2 == null) {
                    return 0;
                }
                BigDecimal bigDec_s1 = new BigDecimal(s1);
                BigDecimal bigDec_s2 = new BigDecimal(s2);
                return bigDec_s2.compareTo(bigDec_s1);
            }
        });
        

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}