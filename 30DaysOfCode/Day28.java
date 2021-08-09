import java.io.*;
import java.util.*;
import java.util.regex.*;



public class Day28 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        String Regex=".+@gmail\\.com$";
        List<String> list= new ArrayList();
        Pattern pattern=Pattern.compile(Regex);

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            String firstName = firstMultipleInput[0];
            String emailID = firstMultipleInput[1];
            Matcher matcher=pattern.matcher(emailID);
            if(matcher.find()){
                list.add(firstName);
            }
        }
        Collections.sort(list);
        for(String names:list){
            System.out.println(names);
        }

        bufferedReader.close();
    }
}