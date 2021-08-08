import java.util.*;

public class JavaList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }
        int q = scan.nextInt();
        scan.nextLine();
        for (int j = 0; j < q; j++) {
            String operation = scan.nextLine();
            if (operation.equals("Insert")) {
                list.add(scan.nextInt(), scan.nextInt());
            }
            else if (operation.equals("Delete")) {
                list.remove(scan.nextInt());
            }
            if(j != q-1){
                scan.nextLine();
            }
        }

        // Printing the list
        for (int k = 0; k < list.size(); k++) {
            System.out.printf("%d ", list.get(k));
        }

        scan.close();
    }
}