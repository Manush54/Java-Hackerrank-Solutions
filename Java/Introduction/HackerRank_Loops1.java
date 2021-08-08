import java.io.*;



public class HackerRank_Loops1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        int i,result;
        
        for(i=1;i<=10;i++)
        {
            result = N*i;
            System.out.println(N + " x " + i + " = " + result );
        }
    }
}
