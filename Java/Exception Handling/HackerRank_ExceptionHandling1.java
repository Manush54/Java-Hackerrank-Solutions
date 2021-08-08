import java.util.*;

public class HackerRank_ExceptionHandling1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        try {
            int first = in.nextInt();
            int second = in.nextInt();
            System.out.println(first/second);

        } catch (InputMismatchException e){
            System.out.println(e.getClass().getName());
        } catch (Exception e) {
            System.out.println(e);
        }
        in.close();
    }
}