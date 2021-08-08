import java.util.*;

public class Day06 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        in.nextLine();
        for (int t = 1; t <= T; t++) {
            String input = in.nextLine();
            String odd = new String();
            String even = new String();

            for (int i = 0; i < input.length(); i++) {
                if (i % 2 == 0) {
                    even += input.charAt(i);
                } else {
                    odd += input.charAt(i);
                }
            }
            System.out.println(even + " " + odd);
        }
        in.close();       
    }
}
