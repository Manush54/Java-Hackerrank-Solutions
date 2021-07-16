import java.util.*;

public class JavaArrayList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<ArrayList<Integer>> master = new ArrayList<ArrayList<Integer>>();
        Scanner scan = new Scanner(System.in);
        int number_of_arrays = scan.nextInt();
        for (int i = 0; i < number_of_arrays; i++) {
            ArrayList<Integer> internal = new ArrayList<Integer>();
            int d = scan.nextInt();
            for (int j = 0; j < d; j++) {
                int num = scan.nextInt();
                internal.add(j, num);
            }
            master.add(internal);
        }
        int number_of_queries = scan.nextInt();
        for (int q = 0; q < number_of_queries; q++) {
            int index_master = scan.nextInt();
            int index_internal = scan.nextInt();
            try{
                System.out.println(master.get(index_master-1).get(index_internal-1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
        scan.close();
    }
}