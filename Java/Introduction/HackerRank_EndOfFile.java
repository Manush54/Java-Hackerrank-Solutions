import java.util.*;

public class HackerRank_EndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (sc.hasNext()) {
            String in = sc.nextLine();
            System.out.printf("%d ", i);
            System.out.println(in);
            i++;
        }

        sc.close();
    }
}