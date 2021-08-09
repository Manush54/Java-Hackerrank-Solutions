import java.io.*;

public class Day16 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();
        try{
            int cvt = Integer.parseInt(S);
            System.out.println(cvt);
        } catch(NumberFormatException e){
            System.out.println("Bad String");
        }
        bufferedReader.close();
    }
}
