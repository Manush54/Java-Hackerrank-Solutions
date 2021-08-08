import java.io.*;

public class Day03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        if(N % 2 == 1){
            System.out.println("Weird");
        }
        else if(2 <= N && N <= 5){
            System.out.println("Not Weird");
        }
        else if(6 <= N && N <= 20){
            System.out.println("Weird");
        }
        else {
            System.out.println("Not Weird");
        }

        bufferedReader.close();
    }
}