import java.util.*;
public class Day01 {
   
   public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
      
        Scanner scan = new Scanner(System.in);
        
        /* Declare second integer, double, and String variables. */
        int j;
        double e;
        String t;

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        j = scan.nextInt();
        e = scan.nextDouble();
        scan.nextLine();
        t = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+j);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d+e);
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s+t);
        
        scan.close();
   }
}




