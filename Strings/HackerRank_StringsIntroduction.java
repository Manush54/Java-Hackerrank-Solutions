import java.util.*;

public class HackerRank_StringsIntroduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        // Summing up the length of both strings
        System.out.println(A.length() + B.length());

        // Comparing both strings lexologically
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        
        // Converting the strings to Camel Case and printing it in a single line.
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1, A.length()) + " " + B.substring(0,1).toUpperCase() + B.substring(1,B.length()));
        sc.close();
    }
}



