import java.util.*;

public class JavaSubArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n]; 
        for (int t = 0; t < n; t++) {
            array[t] = in.nextInt();
        }
        
        int count = 0;
        for (int j = 0; j < array.length; j++) {
            int sum = 0;
            for (int k = j; k < array.length; k++) {
                sum += array[k];
                if (sum < 0) {
                    count++;
            }
            }
        }
        System.out.println(count);

        in.close();
    }
}