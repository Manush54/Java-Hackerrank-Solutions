//Complete this code or write your own from scratch
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class JavaMap {
    public static void main(String[] argh) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> phonebook = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            int phone = Integer.parseInt(br.readLine());
            phonebook.put(name, phone);

        }
        while (br.readLine() != null) {
            String s = br.readLine();
            Integer ph_num = phonebook.get(s);
            if (ph_num == null) {
                System.out.println("Not found");
            } else {
                System.out.printf("%s=%d\n", s, ph_num);
            }

        }
    }
}


