import java.io.*;

public class Day10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int count = 0;
        int highest_count = 0;
        do{
            if(n % 2 == 1){
                count++;
                if(highest_count < count){
                    highest_count = count;
                }
            }
            else if(n % 2 == 0){
                count = 0;
            }
            n = n / 2;
            
        }while(n >= 1);
        System.out.println(highest_count);

        bufferedReader.close();
    }
}
