import java.util.*;

public class Java1DArray2 {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        return isSolvable(leap, game, 0);
    }

    private static boolean isSolvable(int leap, int[] game, int i) {
        // i -->    current step
        // leap --> jump that the person can take.
        // game --> array of the game.
        
        // the current step >= the last step (the end) 
        if (i >= game.length) {
            return true;
        }
        // Case i < 0 only occurs when the person takes back one step in the beginning of the game itself.
        // if game[i] equals 1 then the person cannot go to that step, hence return false.
        else if (i < 0 || game[i] == 1) {
            return false;
        }

        // Mark the visited step as 1, so that it is not repeated.
        game[i] = 1;

        // Recursive Cases:
        // First try to leap if false, 2) try to move forward, if false, 3) try to move backward.  
        return isSolvable(leap, game, i + leap) || isSolvable(leap, game, i+1) || isSolvable(leap, game, i-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}