import java.util.*;
public class JavaBitSet {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        BitSet[] b = new BitSet[]{new BitSet(N), new BitSet(N)};
        for (int i = 0; i < M; i++) {
            String q = in.next();
            int left = in.nextInt() - 1;
            int right = in.nextInt() - 1;
            if (q.equals("AND")) {
                b[left].and(b[right]);
            }
            if (q.equals("OR")) {
                b[left].or(b[right]);
            }
            if (q.equals("XOR")) {
                b[left].xor(b[right]);
            }
            if (q.equals("FLIP")) {
                b[left].flip(N - right - 1);
            }
            if (q.equals("SET")) {
                b[left].set(N - right - 1);
            }
            System.out.println(b[0].cardinality() + " " + b[1].cardinality());
        }
        in.close();
    }
}