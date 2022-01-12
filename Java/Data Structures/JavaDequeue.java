import java.util.*;
public class JavaDequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();
        int n = in.nextInt();  //  Number of elements in the queue
        int m = in.nextInt();  // Length of subarrays to be formed
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            set.add(num);
            if (deque.size() == m) {
                if (set.size() > max) {
                    max = set.size();
                }
                int first = deque.remove();
                if (!deque.contains(first)) set.remove(first);
            }
        }

        in.close();
        System.out.print(max);
    }
}



