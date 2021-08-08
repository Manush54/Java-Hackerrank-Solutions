import java.io.*;
import java.math.*;

public class HackerRank_PrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();
        BigInteger n1;
        Boolean b;
        
        n1 = new BigInteger(n);
        b=n1.isProbablePrime(1);
        
        if (b==true) System.out.println("prime");
        else System.out.println("not prime");
    }
}