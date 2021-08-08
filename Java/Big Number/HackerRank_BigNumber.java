import java.io.*;
import java.math.*;



public class HackerRank_BigNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        boolean prime = false;
        BigInteger bigInt_n = new BigInteger(n);
        prime = bigInt_n.isProbablePrime(1);
        System.out.println(prime ? "prime" : "not prime");
        bufferedReader.close();
    }
}