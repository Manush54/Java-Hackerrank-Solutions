import java.util.*;

class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
    Difference(int[] a){
        elements = a;
    }
    void computeDifference(){
       for (int element1 : elements){
           for (int element2 : elements){
               if(Math.abs(element1 - element2) > maximumDifference){
                   maximumDifference = Math.abs(element1 - element2);
               }
           }
       }
    }

} // End of Difference class

public class Day14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}