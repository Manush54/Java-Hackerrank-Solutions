import java.util.*;

public class HackerRank_StringToken {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.trim();
        if (s.length() == 0) {
            System.out.println(0);
        }
        else {
            String[] strArray = s.split("[ !,?._'@]+");
            System.out.println(strArray.length);
            for (String str : strArray) {
                System.out.println(str);
            }
        }
        scan.close();
    }
}
