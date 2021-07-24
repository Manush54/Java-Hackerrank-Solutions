import java.util.*;

public class JavaHashSet {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        //Write your code here
        Set<String> set = new HashSet<String>();
        for (int j = 0; j < pair_right.length; j++) {
            String concat = pair_left[j] + " "+ pair_right[j];
            set.add(concat);
            System.out.println(set.size());
        }
        s.close();
    }
}