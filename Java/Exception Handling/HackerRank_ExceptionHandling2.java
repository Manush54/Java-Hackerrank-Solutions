import java.util.Scanner;

class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
    long power(int first, int second) throws Exception {
        if(first < 0 || second < 0){
            throw new Exception("n or p should not be negative.");
        }
        else if (first == 0 && second == 0 ){
            throw new Exception("n and p should not be zero.");
        }
        else{
            return (long)Math.pow(first,second);
        }
    }
    
}



public class HackerRank_ExceptionHandling2 {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}